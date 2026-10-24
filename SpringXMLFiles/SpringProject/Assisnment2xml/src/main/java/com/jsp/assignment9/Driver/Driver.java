package com.jsp.assignment9.Driver;

import com.jsp.assignment9.Model.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Load the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("payment-config.xml");

        // Retrieve the OrderService bean
        OrderService orderService = context.getBean("orderService", OrderService.class);

        // Test checkout process
        orderService.checkout(1500.00);
    }
}