package com.jsp.Model;

public class Employee {
    private String loc;
    private Double sallary;
    private String name;

    public Employee(String name, String loc, Double sallary) {
        this.name = name;
        this.loc = loc;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Double getSallary() {
        return sallary;
    }

    public void setSallary(Double sallary) {
        this.sallary = sallary;
    }


}
