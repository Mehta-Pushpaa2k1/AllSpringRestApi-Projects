package com.first;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(StudentApplication.class, args);

        // Student Bean
        Student student = context.getBean(Student.class);
        student.display();

        // Employee Bean
        Employee employee = context.getBean(Employee.class);
        employee.displayEmp();

        // Calculator
        Calculator calculator = context.getBean(Calculator.class);
        calculator.Addition();
        calculator.Subtraction();
        calculator.Multiplication();
        calculator.Division();

        // Car
        Car car = context.getBean(Car.class);
        car.start();
        car.drive();
        car.stop();

        // Bank Bean Called
        Bank bank = context.getBean(Bank.class);
        bank.openAccount();
        bank.deposit();
        bank.checkbalance();
        bank.withdraw();

        // Mobile Bean
        Mobile mobile = context.getBean(Mobile.class);
        mobile.call();
        mobile.sendmessage();
        mobile.takephoto();

        // Student Bean
        Student student1 = context.getBean(Student.class);
        student1.display();

        // Teacher Bean
        Teacher teacher = context.getBean(Teacher.class);
        teacher.teach();

        // Course Bean
        Course course = context.getBean(Course.class);
        course.courseInfo();

    }

}