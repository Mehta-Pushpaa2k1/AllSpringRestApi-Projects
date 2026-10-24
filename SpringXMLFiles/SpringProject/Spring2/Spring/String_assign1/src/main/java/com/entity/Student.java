package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    // @Value(value = "03")
    private int roll;

  //  @Value(value = "Moshim")
    private String name;

    private String address;

    private int age;

    public void marks(){
        System.out.println("Not announced yet");
    }

//    public Student(){
//
//    }

    public Student(@Value(value = "${id}") int roll,@Value(value = "${name}") String name,@Value(value = "${address}") String address,@Value("${age}") int age) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.age = age;
    }


//    public int getRoll() {
//        return roll;
//    }
//
//    public void setRoll(int roll) {
//        this.roll = roll;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    @Value(value = "Haryana")
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Value(value = "21")
//    public void setAge(int age) {
//        this.age = age;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
