package com.spring.Q10;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService
        implements NotificationService {

    @Override
    public void sendNotification() {

        System.out.println("Email notification sent");
    }
}




