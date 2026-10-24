package com.jsp.assignment10.Model;

public class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("[SMS ALERT] " + message);
    }
}