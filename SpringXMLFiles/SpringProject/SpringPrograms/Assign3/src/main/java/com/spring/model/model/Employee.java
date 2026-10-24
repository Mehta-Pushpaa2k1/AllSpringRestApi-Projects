package com.spring.model.model;
public class Employee {

    private String name;
    private Address employeeAddress;

    public Employee(String name) {
        this.name = name;
    }

    // Setter Dependency Injection
    public void setEmployeeAddress(Address employeeAddress) {

        this.employeeAddress = employeeAddress;
    }

    public void displayEmployee() {

        System.out.println("EmployeeNmae" + name);
        System.out.println("EmployeeAddress" + employeeAddress.getCity());
    }
}