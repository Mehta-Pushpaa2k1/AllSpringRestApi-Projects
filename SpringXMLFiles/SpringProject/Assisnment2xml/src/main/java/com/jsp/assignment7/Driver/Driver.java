package com.jsp.assignment7.Driver;

import com.jsp.assignment7.Model.College;
import com.jsp.assignment7.Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("college-config.xml");
        College college = (College) context.getBean("college");

        System.out.println("=== COLLEGE MANAGEMENT ===");
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("Principal   : " + college.getPrincipal().getName());
        System.out.println("Students:");
        for (Student s : college.getStudents()) {
            System.out.println(" - " + s.getStudentName() + " (ID: " + s.getId() + ")");
        }
    }
}