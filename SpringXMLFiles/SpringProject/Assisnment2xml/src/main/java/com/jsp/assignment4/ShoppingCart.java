package com.jsp.assignment4;

public class ShoppingCart {
    private int quantity;
    private Product product; // Yahan Product bean inject hoga

    // Getters and Setters
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    // Method to calculate total price (Product Price * Quantity)
    public double calculateTotalPrice() {
        return product.getPrice()*quantity;
    }

    // xml file  - shopping
}