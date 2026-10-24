package com.jsp.assignment8.Model;

public class Car {
    private Engine engine;

    // Setter for Spring Dependency Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        if (engine != null) {
            engine.start();
            System.out.println("Car is moving...");
        } else {
            System.out.println("Engine is not configured.");
        }
    }
}