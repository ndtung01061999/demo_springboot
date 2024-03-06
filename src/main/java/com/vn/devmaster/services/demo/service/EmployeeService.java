package com.vn.devmaster.services.demo.service;

import com.vn.devmaster.services.demo.domain.Employee;
import com.vn.devmaster.services.demo.dto.EmployeeDTO;
import com.vn.devmaster.services.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee findById(String id) {
        List<Employee> employeeList =
                employeeRepository.findAll();

        //tìm ra 1 employee

        return null;
    }

    public EmployeeDTO findOne() {
        Employee employee = employeeRepository.findById();
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setSalary(employee.getSalary());
        return employeeDTO;
    }
}
