package com.spring.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.model.Car;
import com.spring.model.Engine;

@Configuration
public class AppConfig {

    @Bean
    public Engine engine() {

        return new Engine();
    }

    @Bean
    public Car car() {

        return new Car(engine());
    }
}
