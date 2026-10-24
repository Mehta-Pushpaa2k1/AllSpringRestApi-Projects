package com.springwork;

public class Mobile {
    private int mobile_id;
    private String brand;
    private  String price;

    public Mobile(){

    }

    public Mobile(int mobile_id, String brand, String price) {
        this.mobile_id = mobile_id;
        this.brand = brand;
        this.price = price;
    }


    public int getMobile_id() {
        return mobile_id;
    }

    public void setMobile_id(int mobile_id) {
        this.mobile_id = mobile_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public void screen(){
        System.out.println("mobile screen is black");
    }
}
