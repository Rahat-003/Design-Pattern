package com.example.designpattern.FacadePattern.With;

import com.example.designpattern.FacadePattern.OrderService;
import com.example.designpattern.FacadePattern.PaymentService;
import com.example.designpattern.FacadePattern.UserService;

public class ApiGateway {
    private UserService userService;
    private OrderService orderService;
    private PaymentService paymentService;


    public ApiGateway(){
        userService = new UserService();
        orderService = new OrderService();
        paymentService = new PaymentService();
    }

    // Task
    public String getFullOrderDetails(String userId, String orderId, String paymentId) {
        String userDetails = userService.getUserDetails(userId);
        String orderDetails = orderService.getOrderDetails(orderId);
        String paymentDetails = paymentService.processPayment(paymentId);

        return userDetails + "\n" + orderDetails + "\n" + paymentDetails;
    }

}
