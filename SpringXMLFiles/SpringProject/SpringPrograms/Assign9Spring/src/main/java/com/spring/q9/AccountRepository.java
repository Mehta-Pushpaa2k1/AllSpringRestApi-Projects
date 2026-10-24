package com.spring.q9;

import org.springframework.stereotype.Component;

@Component
public class AccountRepository {

    public void checkAccount() {
        System.out.println("Account checked");
    }
}