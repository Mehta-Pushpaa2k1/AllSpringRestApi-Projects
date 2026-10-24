package com.first;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

    public void call() {
        System.out.println("Calling...");
    }

    public void sendmessage() {
        System.out.println("Message sent");
    }

    public void takephoto() {
        System.out.println("Photo taken");
    }
}