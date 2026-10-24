package com.spring.q9;

import org.springframework.stereotype.Component;

@Component
public class TransactionService {

    public void makeTransaction() {
        System.out.println("Transaction completed");
    }
}