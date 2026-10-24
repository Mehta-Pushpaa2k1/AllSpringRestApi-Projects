package com.first;

import org.springframework.stereotype.Component;

@Component
public class Bank {

    public void openAccount() {
        System.out.println("Bank account opened");
    }

    public void deposit() {
        System.out.println("Amount deposited");
    }

    public void withdraw() {
        System.out.println("Amount withdrawn");
    }

    public void checkbalance() {
        System.out.println("Balance checked");
    }
}
