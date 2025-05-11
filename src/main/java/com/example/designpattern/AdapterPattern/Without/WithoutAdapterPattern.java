package com.example.designpattern.AdapterPattern.Without;


import com.example.designpattern.AdapterPattern.EmailNotificationService;
import com.example.designpattern.AdapterPattern.NotificationService;

/**
 * See the problem documentation in {@link com.example.designpattern.AdapterPattern.AdapterPatternMain AdapterPattern Problem Statement}.
 *
 * <h2>🚫 Problems Without Using Adapter Pattern</h2>
 *
 * <ul>
 *   <li>
 *     <strong>Incompatibility with Third-Party or Legacy Services</strong><br>
 *     The <code>NotificationService</code> interface is designed with the method:
 *     <pre><code>
 * void send(String to, String subject, String body);
 *     </code></pre>
 *     However, third-party libraries like <code>SendGridService</code> use a different method:
 *     <pre><code>
 * public void sendEmail(String recipient, String title, String body);
 *     </code></pre>
 *     Since the method signatures don’t match, direct usage like below is not possible:
 *     <pre><code>
 * // This will not compile
 * NotificationService sendGridService = new SendGridService();
 * sendGridService.send(...);
 *     </code></pre>
 *     This leads to integration failure or forces developers to change existing interfaces, which breaks encapsulation.
 *   </li>
 *
 *   <li>
 *     <strong>Violation of Open/Closed Principle</strong><br>
 *     To integrate <code>SendGridService</code>, the developer might be tempted to modify existing classes like <code>NotificationService</code> or <code>EmailNotificationService</code>.
 *     <br><br>This violates the Open/Closed Principle — classes should be open for extension but closed for modification.
 *     <pre><code>
 * // BAD: Changing interface to accommodate SendGrid
 * public interface NotificationService {
 *     void send(String to, String subject, String body);
 *     void sendEmail(String recipient, String title, String body); // NOT scalable
 * }
 *     </code></pre>
 *     Such changes ripple across all classes that depend on this interface.
 *   </li>
 *
 *   <li>
 *     <strong>Tight Coupling to Specific Implementations</strong><br>
 *     Without an adapter, only <code>EmailNotificationService</code> can be used via <code>NotificationService</code>.
 *     This locks the application into one specific implementation and makes switching or scaling notification services difficult.
 *     <br><br>For example:
 *     <pre><code>
 * NotificationService service = new EmailNotificationService(); // Tightly coupled
 *     </code></pre>
 *     Trying to switch to another service like <code>SendGridService</code> causes errors unless the new class directly implements the same interface.
 *   </li>
 *
 *   <li>
 *     <strong>Duplication of Logic</strong><br>
 *     Developers may duplicate the sending logic across services with similar functionality, instead of reusing a common abstraction.
 *     <br><br>Without an adapter:
 *     <pre><code>
 * SendGridService sendGrid = new SendGridService();
 * sendGrid.sendEmail("x@gmail.com", "Title", "Body");
 *
 * EmailNotificationService emailService = new EmailNotificationService();
 * emailService.send("x@gmail.com", "Title", "Body");
 *     </code></pre>
 *     This results in repeated logic and lack of a unified communication strategy.
 *   </li>
 *
 *   <li>
 *     <strong>Reduced Testability and Flexibility</strong><br>
 *     You cannot easily swap out the underlying email provider for testing or A/B experiments.
 *     A standard interface like <code>NotificationService</code> should allow mock implementations or stubs.
 *     Without an adapter to unify the API, developers lose this flexibility.
 *   </li>
 * </ul>
 *
 * <p>✅ The Adapter Pattern solves all of the above by introducing an intermediary class (e.g., <code>SendGridAdapter</code>) that implements <code>NotificationService</code> and internally delegates to <code>SendGridService</code>.</p>
 */

public class WithoutAdapterPattern {
    public static void main(String[] args) {
        System.out.println("------- Without Adapter Pattern -------");

        NotificationService emailService = new EmailNotificationService();
        emailService.send("foodpanda@gmail.com", "Order Confirmation", "Your order has been received!");

        /**
         * This won't work
         * NotificationService sendGridService = new SendGridService();
        */
    }
}
