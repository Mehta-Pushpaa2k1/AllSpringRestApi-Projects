package com.jsp.assignment8.Driver;

import com.jsp.assignment8.Model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Load the XML configuration from resources folder
        ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");

        // Retrieve the car bean
        Car car = context.getBean("car", Car.class);

        // Run the method
        car.drive();
    }
}