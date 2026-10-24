package com.spring.driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.model.Car;

public class App {

    public static void main(String[] args) {

        // Create Spring Container
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Car Bean
        Car car = context.getBean(Car.class);

        // Run Car
        car.runCar();
    }
}

