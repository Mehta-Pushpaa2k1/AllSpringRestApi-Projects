package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component    // it is used to mark the class spring name
public class Employee {

    @Value(value = "99")
    private int id;

    private String name;

    @Value(value = "moshim@gmail.com")
    private String gamil;

    private double salary;

     public void m1(){
         System.out.println("Calling method");
     }

     public Employee(){

     }


    public Employee(int id, String name, String gamil, double salary) {
        this.id = id;
        this.name = name;
        this.gamil = gamil;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Value(value = "Mohsim")
    public void setName(String name) {
        this.name = name;
    }

    public String getGamil() {
        return gamil;
    }

    public void setGamil(String gamil) {
        this.gamil = gamil;
    }

    public double getSalary() {
        return salary;
    }
    @Value(value = "25000")
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
