package com.vn.devmaster.services.demo.controller;

import com.vn.devmaster.services.demo.domain.Employee;
import com.vn.devmaster.services.demo.dto.EmployeeDTO;
import com.vn.devmaster.services.demo.repository.EmployeeRepository;
import com.vn.devmaster.services.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("")
    EmployeeDTO findById() {
        return employeeService.findOne();
    }

    @GetMapping("/{id}")
    Employee findById(@PathVariable("id") String id) {
        return employeeService.findById(id);
    }

    @GetMapping("/all")
    List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
