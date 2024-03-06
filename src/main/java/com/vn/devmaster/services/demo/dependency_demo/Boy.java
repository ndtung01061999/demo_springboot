package com.vn.devmaster.services.demo.dependency_demo;

import org.springframework.stereotype.Component;

//@Component
public class Boy implements Person {

    @Override
    public void wear() {
        System.out.println("Boy wear jean");
    }
}
