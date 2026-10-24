package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {

        ApplicationContext con =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Person p = con.getBean(Person.class);
        p.display();
    }
}