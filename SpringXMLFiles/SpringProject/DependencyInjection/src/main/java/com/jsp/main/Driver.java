package com.jsp.main;

import com.jsp.Model.Address;
import com.jsp.Model.Employee;
import com.jsp.Model.Person;
import com.jsp.Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ApplicationContext con =
                new ClassPathXmlApplicationContext("config.xml");

        Student s= (Student) con.getBean("student");
        System.out.println(s.getCgpa());
        System.out.println(s.getName());
        System.out.println(s.getPhno());
        System.out.println(s.getRoll());

        Employee e=(Employee) con.getBean("employee");
        System.out.println(e.getLoc());
        System.out.println(e.getSallary());
        System.out.println(e.getName());

    Person p =  (Person) con.getBean("person");
  Address a = p.getAddress();
        System.out.println(a.getHno());
        System.out.println(a.getPincode());

    }
}
