package com.first;

public class Person {

    private String name;
    private String city;
    private String address;
    public Person() {
    }

    public Person(String name, String city,String address) {
        this.name = name;
        this.city = city;
        this.address=address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("address" +address);
    }
}