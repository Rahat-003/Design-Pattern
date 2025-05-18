package com.example.designpattern.FacadePattern;


// Microservice for Order Management

public class OrderService {
    public String getOrderDetails(String orderId) {
        // Fetching order details
        return "Order details for orderId: " + orderId;
    }
}
