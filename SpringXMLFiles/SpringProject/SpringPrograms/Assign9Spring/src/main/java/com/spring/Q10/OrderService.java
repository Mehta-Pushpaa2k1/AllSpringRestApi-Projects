package com.spring.Q10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private NotificationService notificationService;

    public void placeOrder() {

        System.out.println("Order placed");

        notificationService.sendNotification();
    }
}
Output