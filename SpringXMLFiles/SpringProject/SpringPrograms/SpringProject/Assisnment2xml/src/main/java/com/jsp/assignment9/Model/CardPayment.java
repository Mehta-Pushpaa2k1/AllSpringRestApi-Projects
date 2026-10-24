package com.jsp.assignment9.Model;

public class CardPayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " payment via Credit/Debit Card.");
    }
}