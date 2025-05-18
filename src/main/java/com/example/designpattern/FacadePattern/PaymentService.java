package com.example.designpattern.FacadePattern;



// Microservice for Payment Processing

public class PaymentService {
    public String processPayment(String paymentId) {
        // Fetching payment processing
        return "Processing payment with paymentId: " + paymentId;
    }
}
