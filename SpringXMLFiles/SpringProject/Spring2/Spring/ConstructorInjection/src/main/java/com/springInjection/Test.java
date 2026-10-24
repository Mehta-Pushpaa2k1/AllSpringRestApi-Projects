package com.springInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ApplicationContext  ac= new ClassPathXmlApplicationContext("config.xml");
       Product pro =(Product)  ac.getBean("product");

         pro.m1();
        System.out.println(pro.getP_id());
        System.out.println(pro.getP_name());
        System.out.println(pro.getP_price());
        System.out.println(pro.getCategory());
        System.out.println(pro.getStudent());



        Product pro1 =(Product)  ac.getBean("product1");
        System.out.println(pro1.getP_id());
        System.out.println(pro1.getP_name());
        System.out.println(pro1.getP_price());
        System.out.println(pro1.getCategory());
        System.out.println(pro1.getStudent());
    }

}
