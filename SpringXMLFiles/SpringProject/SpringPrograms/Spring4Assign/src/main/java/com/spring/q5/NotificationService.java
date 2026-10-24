package com.spring.q5;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public void sendNotification() {
        System.out.println("Notification sent");
    }
}