package com.example.designpattern.AdapterPattern.With;

import com.example.designpattern.AdapterPattern.EmailNotificationService;
import com.example.designpattern.AdapterPattern.NotificationService;
import com.example.designpattern.AdapterPattern.SendGridService;



/**
 * <h2>✅ Benefits of Using the Adapter Pattern</h2>
 *
 * <ol>
 *   <li>
 *     <strong>Client Interface Consistency</strong><br>
 *     The application interacts only with the common interface <code>NotificationService</code> regardless of the underlying email service.<br><br>
 *     Example:<br>
 *     <pre><code>
 * NotificationService sendGridEmailService = new SendGridAdapter(new SendGridService());
 * sendGridEmailService.send("user@example.com", "Subject", "Body");
 *     </code></pre>
 *     The client code remains unchanged when switching providers.
 *   </li>
 *
 *   <li>
 *     <strong>Decouples Application from Third-Party Libraries</strong><br>
 *     The main application is not tightly coupled to <code>SendGridService</code>.<br>
 *     Instead, it uses <code>SendGridAdapter</code> to bridge communication.
 *   </li>
 *
 *   <li>
 *     <strong>Single Responsibility Principle</strong><br>
 *     Each class has one job: <br>
 *     <ul>
 *       <li><code>SendGridService</code> – Handles email delivery via SendGrid.</li>
 *       <li><code>SendGridAdapter</code> – Translates to the interface expected by the application.</li>
 *     </ul>
 *   </li>
 *
 *   <li>
 *     <strong>Open/Closed Principle (SOLID)</strong><br>
 *     To add another provider (e.g., Twilio, Mailchimp), implement a new adapter. No changes are needed in the main logic.
 *   </li>
 *
 *   <li>
 *     <strong>Polymorphism Support</strong><br>
 *     All services are treated as <code>NotificationService</code> by the main program.<br>
 *     This makes it easy to switch providers or test using mock implementations.
 *   </li>
 *
 *   <li>
 *     <strong>Real-World Flexibility</strong><br>
 *     This pattern is often used to integrate legacy systems or third-party SDKs into a unified interface.
 *     <br><br>
 *     Example of actual adapter usage:<br>
 *     <pre><code>
 * public class SendGridAdapter implements NotificationService {
 *     private SendGridService sendGridService;
 *
 *     public SendGridAdapter(SendGridService sendGridService) {
 *         this.sendGridService = sendGridService;
 *     }
 *
 *     @Override
 *     public void send(String to, String subject, String body) {
 *         sendGridService.sendEmail(to, subject, body);
 *     }
 * }
 *     </code></pre>
 *   </li>
 * </ol>
 */


public class WithAdapterPattern {
    public static void main(String[] args) {
        System.out.println("------- With Adapter Pattern -------");

        NotificationService emailService = new EmailNotificationService();
        emailService.send("foodie@gmail.com", "Order Confirmation", "Your order has been placed!");

        System.out.println();

        NotificationService sendGridEmailService = new SendGridAdapter(new SendGridService());
        sendGridEmailService.send("sendgrid@gmail.com", "Order Confirmation", "Notification sent from SendGrid service");

    }
}
