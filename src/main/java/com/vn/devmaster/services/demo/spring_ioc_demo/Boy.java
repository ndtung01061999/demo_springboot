package com.vn.devmaster.services.demo.spring_ioc_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Boy implements Person {

    @Override
    public void wear() {
        System.out.println("Boy wear jean");
    }
}
