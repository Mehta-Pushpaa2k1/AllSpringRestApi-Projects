package com.springInjection;

public class Product {

    private int p_id;
    private String p_name;
    private double p_price;
    private String category;
    private Student student;

    public void m1(){
        System.out.println("I'm product class method");
    }

    public Product(){

    }

    public Product(int p_id, String p_name, double p_price, String category,Student student ) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.category = category;
        this.student=student;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public double getP_price() {
        return p_price;
    }

    public void setP_price(double p_price) {
        this.p_price = p_price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
