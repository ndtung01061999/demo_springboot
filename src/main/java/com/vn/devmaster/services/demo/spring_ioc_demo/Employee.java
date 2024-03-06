package com.vn.devmaster.services.demo.spring_ioc_demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Qualifier("girl")
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }
}
