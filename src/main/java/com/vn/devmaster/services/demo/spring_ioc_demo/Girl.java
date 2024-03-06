package com.vn.devmaster.services.demo.spring_ioc_demo;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Person {
    @Override
    public void wear() {
        System.out.println("Girl wear dress");
    }
}
