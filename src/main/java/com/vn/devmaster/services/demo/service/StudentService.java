package com.vn.devmaster.services.demo.service;

import com.vn.devmaster.services.demo.domain.Student;
import com.vn.devmaster.services.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student getOne() {
        Student student = studentRepository.getOne();
        return student;
    }
}
