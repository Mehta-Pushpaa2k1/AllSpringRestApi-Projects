package com.jsp.assignment9.Model;

public class UPIPayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " payment via UPI.");
    }
}