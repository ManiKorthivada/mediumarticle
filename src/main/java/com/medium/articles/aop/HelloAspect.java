package com.medium.articles.aop;

import com.medium.articles.annotation.HelloAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Aspect
public class HelloAspect {

    @Around("@annotation(com.medium.articles.annotation.HelloAnnotation)")
    public void execute(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        HelloAnnotation helloAnnotation = method.getAnnotation(HelloAnnotation.class);
        System.out.println("Annotation printing " + helloAnnotation.name()+" ");
        proceedingJoinPoint.proceed();
        System.out.println("After Annotation ");
    }
}
