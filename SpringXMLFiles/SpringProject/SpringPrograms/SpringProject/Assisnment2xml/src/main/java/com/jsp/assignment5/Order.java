package com.jsp.assignment5;

public class Order {
    private int orderId;
    private Customer customer;
    private Restaurant restaurant;
    private FoodItem foodItem;
    private int quantity;

    // Getters and Setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Restaurant getRestaurant() { return restaurant; }
    public void setRestaurant(Restaurant restaurant) { this.restaurant = restaurant; }

    public FoodItem getFoodItem() { return foodItem; }
    public void setFoodItem(FoodItem foodItem) { this.foodItem = foodItem; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Method to calculate total order amount
    public double calculateTotalAmount() {
        return foodItem.getPrice() * quantity;
    }
}