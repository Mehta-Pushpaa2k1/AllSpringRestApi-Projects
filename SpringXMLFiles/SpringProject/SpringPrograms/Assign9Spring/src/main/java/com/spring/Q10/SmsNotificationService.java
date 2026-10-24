package com.spring.Q10;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsNotificationService
        implements NotificationService {

    @Override
    public void sendNotification() {

        System.out.println("SMS notification sent");
    }
}