package com.spring.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.q9.BankServiceConstructor;

public class Q9App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankServiceConstructor bankService =
                context.getBean(BankServiceConstructor.class);

        bankService.processBanking();
    }
}