package com.vn.devmaster.services.demo.repository;

import com.vn.devmaster.services.demo.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    public Employee findById() {
        return Employee
                .builder()
                .address("HĐ")
                .id("123")
                .salary(123)
                .build();
    }

    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Employee employee = Employee
                    .builder()
                    .address("HĐ")
                    .id(String.valueOf(i+1))
                    .salary(123)
                    .build();
            employeeList.add(employee);
        }
        return employeeList;
    }
}
