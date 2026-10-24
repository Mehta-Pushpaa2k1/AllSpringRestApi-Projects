package com.jsp.assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Spring Container initialize karna using food-config.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("food-config.xml");

        // Order bean fetch karna
        Order order = (Order) context.getBean("order");

        // Complete Order Details Display karna
        System.out.println("=== ONLINE FOOD ORDER DETAILS ===");
        System.out.println("Order ID        : " + order.getOrderId());
        System.out.println("Customer Name   : " + order.getCustomer().getName());
        System.out.println("Customer Phone  : " + order.getCustomer().getPhone());
        System.out.println("Restaurant      : " + order.getRestaurant().getRestName() + " (" + order.getRestaurant().getLocation() + ")");
        System.out.println("Food Item       : " + order.getFoodItem().getItemName());
        System.out.println("Price per item  : " + order.getFoodItem().getPrice());
        System.out.println("Quantity        : " + order.getQuantity());
        System.out.println("----------------------------------");
        System.out.println("Total Amount    : " + order.calculateTotalAmount());
    }
}