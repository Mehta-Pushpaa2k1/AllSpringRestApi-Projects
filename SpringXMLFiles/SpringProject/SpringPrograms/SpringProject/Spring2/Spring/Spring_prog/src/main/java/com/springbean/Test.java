package com.springbean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
      ApplicationContext con=  new ClassPathXmlApplicationContext("config.xml");
       Car c=(Car) con.getBean("car");
       c.speed();

        System.out.println(c.getCar_no());
        System.out.println(c.getBrand());
        System.out.println(c.getColor());
        System.out.println(c.getPrice());
    }
}
