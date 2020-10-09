package com.medium.articles.config;

import com.medium.articles.Service.HelloService;
import com.medium.articles.Service.HelloServiceImpl;
import com.medium.articles.aop.HelloAspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({HelloService.class, HelloAspect.class})
public class HelloConfig {

    @Bean
    @ConditionalOnMissingClass
    public HelloService helloService() {
        return new HelloServiceImpl();
    }

    @Bean
    @ConditionalOnMissingClass
    public HelloAspect helloAspect() {
        return new HelloAspect();
    }
}
