package com.vn.devmaster.services.demo.repository;

import com.vn.devmaster.services.demo.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student getOne() {
        return Student
                .builder()
                .name("Tung")
                .address("Ha Dong")
                .build();
    }
}
