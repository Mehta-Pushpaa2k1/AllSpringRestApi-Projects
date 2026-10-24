package com.spring.model.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.model.Employee;

public class App {

    public static void main(String[] args) {

        // Create Spring Container
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Employee Bean
        Employee employee = context.getBean(Employee.class);

        // Display Employee Details
        employee.displayEmployee();
    }
}