package com.spring.model;
public class Car {

    private Engine engine;

    // Constructor Dependency Injection
    public Car(Engine engine) {

        this.engine = engine;
    }

    public void runCar() {

        engine.startEngine();

        System.out.println("Car is running using Engine");
    }
}