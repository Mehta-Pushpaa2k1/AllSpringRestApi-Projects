package com.spring.model;

public class student {
    private int id;
    private String name;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
