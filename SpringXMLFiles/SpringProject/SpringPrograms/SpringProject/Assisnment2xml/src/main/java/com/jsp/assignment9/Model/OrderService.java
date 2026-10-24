package com.jsp.assignment9.Model;

public class OrderService {
    private PaymentService paymentService;

    // Setter for Spring Dependency Injection
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double amount) {
        if (paymentService != null) {
            paymentService.processPayment(amount);
            System.out.println("Order placed successfully!\n");
        } else {
            System.out.println("Payment service not configured.");
        }
    }
}