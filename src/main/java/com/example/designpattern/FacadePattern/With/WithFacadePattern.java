package com.example.designpattern.FacadePattern.With;





/**
 * Demonstrates the use of the <b>Facade Design Pattern</b> to simplify interaction with
 * multiple complex subsystems.
 *
 * <p>
 * This class shows how a client can use a single entry point—{@link ApiGateway}—to access and
 * coordinate functionality across multiple services like {@code UserService},
 * {@code OrderService}, and {@code PaymentService}.
 * </p>
 *
 * <h2>1. Problem Solved</h2>
 * <ul>
 *   <li>Reduces the complexity of client code.</li>
 *   <li>Provides a centralized access point for orchestrating operations.</li>
 *   <li>Minimizes direct dependencies on multiple subsystems.</li>
 *   <li>Improves code readability and maintainability.</li>
 * </ul>
 *
 * <h2>2. Code Example</h2>
 * <pre>{@code
 * ApiGateway apiGateway = new ApiGateway();
 * String fullOrderDetails = apiGateway.getFullOrderDetails("1722", "1505250001", "bkash001");
 * System.out.println(fullOrderDetails);
 * }</pre>
 *
 * <h2>3. Key Concepts</h2>
 * <ul>
 *   <li><b>Facade:</b> {@link ApiGateway} encapsulates calls to several services.</li>
 *   <li><b>Subsystems:</b> {@code UserService}, {@code OrderService}, and {@code PaymentService}.</li>
 *   <li><b>Client:</b> {@code WithFacadePattern} communicates only with the facade.</li>
 * </ul>
 *
 * <h2>4. Real-World Use Cases</h2>
 * <ul>
 *   <li><b>API Gateway in Microservices:</b> Aggregate multiple backend services into a single response.</li>
 *   <li><b>UI Layer Communication:</b> Simplify backend calls from UI or frontend layers.</li>
 *   <li><b>System Initialization:</b> Provide a simplified interface to initialize or shut down subsystems.</li>
 *   <li><b>Integration Layers:</b> Adapt different internal services for third-party APIs.</li>
 * </ul>
 *
 * @see ApiGateway
 */

public class WithFacadePattern {
    public static void main(String[] args) {
        System.out.println("------- With Facade Pattern -------");

        ApiGateway apiGateway = new ApiGateway();

        String fullOrderDetails = apiGateway.getFullOrderDetails("1722", "1505250001", "bkash001");
        System.out.println(fullOrderDetails);
    }
}
