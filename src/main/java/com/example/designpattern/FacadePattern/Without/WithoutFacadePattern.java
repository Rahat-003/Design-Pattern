package com.example.designpattern.FacadePattern.Without;

import com.example.designpattern.FacadePattern.OrderService;
import com.example.designpattern.FacadePattern.PaymentService;
import com.example.designpattern.FacadePattern.UserService;




/**
 * Demonstrates how client code becomes tightly coupled and complex
 * when directly interacting with multiple subsystems without using
 * the Facade Design Pattern.
 *
 * <p>
 * In this example, the client directly communicates with three different
 * microservices: {@code UserService}, {@code OrderService}, and
 * {@code PaymentService}. While functionally correct, this approach
 * violates the principle of minimizing coupling between client code and subsystems.
 * </p>
 *
 * <h2>1. Problem Overview</h2>
 * <ul>
 *   <li>The client must know which services to call and in what order.</li>
 *   <li>Code becomes harder to maintain as the number of services increases.</li>
 *   <li>Any change in service interfaces requires changes in all clients.</li>
 *   <li>Low cohesion: task-specific orchestration is spread across the client instead of being centralized.</li>
 * </ul>
 *
 * <h2>2. Example Usage</h2>
 * <pre>{@code
 * // Client code directly managing subsystem interactions
 * UserService userService = new UserService();
 * OrderService orderService = new OrderService();
 * PaymentService paymentService = new PaymentService();
 *
 * System.out.println(userService.getUserDetails("1722"));
 * System.out.println(orderService.getOrderDetails("18052500001"));
 * System.out.println(paymentService.processPayment("bkash001"));
 * }</pre>
 *
 * <h2>3. Design Suggestion</h2>
 * <p>
 * To improve this design, introduce a <strong>Facade</strong> class that abstracts away
 * the complexity of interacting with individual subsystems. This makes the client code simpler,
 * more readable, and more maintainable.
 * </p>
 *
 * @see com.example.designpattern.FacadePattern.With.WithFacadePattern
 */
public class WithoutFacadePattern {

    public static void main(String[] args) {
        System.out.println("------- Without Facade Pattern -------");


        // Client code interacting with different services directly
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        // Task
        System.out.println(userService.getUserDetails("1722"));
        System.out.println(orderService.getOrderDetails("18052500001"));
        System.out.println(paymentService.processPayment("bkash001"));
    }
}
