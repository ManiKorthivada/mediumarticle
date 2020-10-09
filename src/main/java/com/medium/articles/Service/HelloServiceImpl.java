package com.medium.articles.Service;

import org.springframework.beans.factory.annotation.Value;

public class HelloServiceImpl implements HelloService {

    @Value("${demo.string}")
    String demoValue;

    @Override
    public void hello() {
        System.out.println("Hello World From Autoconfig Setup" + demoValue);
    }
}
