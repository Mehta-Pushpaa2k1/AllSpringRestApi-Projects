package com.first;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public void Addition() {
        int a = 10;
        int b = 5;
        System.out.println("Addition"+(a + b));
    }

    public void Subtraction() {
        int a = 10;
        int b = 5;
        System.out.println("Subtraction"+(a-b));
    }

    public void Multiplication() {
        int a = 10;
        int b = 5;
        System.out.println("Multiplication"+(a*b));
    }

    public void Division() {
        int a = 10;
        int b = 5;
        System.out.println("Division"+(a/b));
    }
}