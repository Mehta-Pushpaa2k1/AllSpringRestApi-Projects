package com.jsp.controller;

import com.jsp.entity.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/employee/save")
    public Employee saveEmployee(Employee employee){
        return employee;
    }
}
