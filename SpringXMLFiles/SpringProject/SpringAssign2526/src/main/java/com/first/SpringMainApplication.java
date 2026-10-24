package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMainApplication {

    public static void main(String[] args) {
        // Spring Boot application run karein aur ApplicationContext return lein
        ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);

        // Student bean ko context se get karein
        Student student = context.getBean(Student.class);

        // display method call karein
        student.display();
    }
}