package com.jsp.main;

import com.jsp.config.Config;
import com.jsp.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
   public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Employee e = (Employee) context.getBean("employee");
       System.out.println(e.getId());



    }
}