package com.jsp.assignment9.Model;

public class NetBankingPayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " payment via Net Banking.");
    }
}