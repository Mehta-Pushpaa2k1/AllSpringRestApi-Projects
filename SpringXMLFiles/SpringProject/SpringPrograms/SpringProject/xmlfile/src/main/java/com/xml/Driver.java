package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ApplicationContext con =
                new ClassPathXmlApplicationContext("config.xml");

        Person p = (Person) con.getBean("person");

        p.call();
    }
}