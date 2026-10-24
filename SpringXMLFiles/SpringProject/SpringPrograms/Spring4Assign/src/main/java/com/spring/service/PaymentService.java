package com.spring.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void makePayment() {

        System.out.println("Payment successful");
    }
}