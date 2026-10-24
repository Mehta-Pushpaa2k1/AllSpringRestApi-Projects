package com.springwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
      ApplicationContext ac =new  ClassPathXmlApplicationContext("config.xml");
      Mobile m =(Mobile) ac.getBean("mob");
      m.screen();
        System.out.println(m.getMobile_id());
        System.out.println(m.getBrand());
        System.out.println(m.getPrice());

        Mobile m1 =(Mobile) ac.getBean("mob1");
        System.out.println(m1.getMobile_id());
        System.out.println(m1.getBrand());
        System.out.println(m1.getPrice());

        Mobile m2 =(Mobile) ac.getBean("mob2");
        System.out.println(m2.getMobile_id());
        System.out.println(m2.getBrand());
        System.out.println(m2.getPrice());

        Mobile m3 =(Mobile) ac.getBean("mob3");
        System.out.println(m3.getMobile_id());
        System.out.println(m3.getBrand());
        System.out.println(m3.getPrice());

        Mobile m4 =(Mobile) ac.getBean("mob4");
        System.out.println(m4.getMobile_id());
        System.out.println(m4.getBrand());
        System.out.println(m4.getPrice());

    }
}
