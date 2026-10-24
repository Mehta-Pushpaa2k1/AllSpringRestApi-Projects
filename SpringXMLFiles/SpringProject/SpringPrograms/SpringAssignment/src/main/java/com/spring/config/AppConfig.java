package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.model.Student;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student(1, "Pushpa");
    }
}