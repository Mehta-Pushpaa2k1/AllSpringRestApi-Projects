package com.jsp.assignment4.Driver;

import com.jsp.assignment4.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Spring Container ko XML file ke sath initialize karna
        ApplicationContext context = new ClassPathXmlApplicationContext("shopping-config.xml");

        // ShoppingCart bean ko container se lena
        ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");

        // Details print karna
        System.out.println("=== SHOPPING CART DETAILS ===");
        System.out.println("Product ID   : " + cart.getProduct().getProductId());
        System.out.println("Product Name : " + cart.getProduct().getName());
        System.out.println("Unit Price   : " + cart.getProduct().getPrice());
        System.out.println("Quantity     : " + cart.getQuantity());
        System.out.println("-----------------");
        System.out.println("Total Price  : " + cart.calculateTotalPrice());
    }
}