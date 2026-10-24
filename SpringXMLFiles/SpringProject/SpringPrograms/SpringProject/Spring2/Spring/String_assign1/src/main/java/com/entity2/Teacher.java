package com.entity2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    @Value(value = "Pooja")
    private String t_name;

    @Value(value = "female")
    private String gender;

    @Value(value = "28")
    private int age;

    public void responsibility(){
        System.out.println("I am a class 10th class teacher");
    }

    public Teacher(){

    }

    public Teacher(String t_name, String gender, int age) {
        this.t_name = t_name;
        this.gender = gender;
        this.age = age;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
