package com.spring.q5;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {

    public void saveEmployee() {
        System.out.println("Employee saved");
    }
}