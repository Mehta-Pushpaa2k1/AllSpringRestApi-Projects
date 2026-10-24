package com.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Person person() {

        Person p = new Person("Pushpa", "Delhi");

        return p;
    }
}

