package com.vn.devmaster.services.demo.dependency_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Employee {

    @Autowired
    Person person;

//    public Employee(Person person) {
//        this.person = person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
    public Person getPerson() {
        return person;
    }
}
