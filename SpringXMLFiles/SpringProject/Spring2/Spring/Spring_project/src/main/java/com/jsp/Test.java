package com.jsp;

import com.qsp.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

       ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
      Employee emp= (Employee) context.getBean("employee");
      emp.m1();
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getGamil());
        System.out.println(emp.getSalary());

        Product product=(Product) context.getBean("product");
        product.items();
    }
}



