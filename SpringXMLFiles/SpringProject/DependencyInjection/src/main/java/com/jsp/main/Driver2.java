package com.jsp.main;

import com.jsp.Model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Driver2 {
    public static void main(String[] args) {
        ApplicationContext con =
                new ClassPathXmlApplicationContext("config.xml");

        Colln c = (Colln) con.getBean("Colln");

        System.out.println(c.getLi());
        System.out.println(c.getSet());
        System.out.println(c.getMap());

        //3rd
        Bank b = (Bank) con.getBean("bank");
        System.out.println(b.getAccount());
        System.out.println(b.getBankName());
    Account a = b.getAccount();
        System.out.println(a.getAccountNumber());
   }
}
