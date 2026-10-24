package com.first;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public void start() {
        System.out.println("Car started Successfully");
    }

    public void stop() {
        System.out.println("Car Stopped Now");
    }

    public void drive() {
        System.out.println("Car is driving");
    }
}