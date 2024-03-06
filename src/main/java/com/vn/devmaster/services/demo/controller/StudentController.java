package com.vn.devmaster.services.demo.controller;

import com.vn.devmaster.services.demo.domain.Student;
import com.vn.devmaster.services.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    Student getOneStudent() {
        return studentService.getOne();
    }
}
