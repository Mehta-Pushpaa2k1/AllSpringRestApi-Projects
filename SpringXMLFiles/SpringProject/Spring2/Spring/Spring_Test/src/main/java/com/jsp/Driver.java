package com.jsp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {

     ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
     Employee e =(Employee)context.getBean("emp");
     e.m1();
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getEmail());
        System.out.println(e.getPassword());
        System.out.println(e.getLi());
        System.out.println(e.getSet());
        System.out.println(e.getMap());

    }
}
