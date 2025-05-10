package com.example.designpattern.AbstractFactoryPattern.With;

/**
 * <h2>✅ Benefits of Using Abstract Factory Pattern</h2>
 *
 * <ol style="font-size: 1.5em;">
 *   <li>
 *     <strong>Separation of Concerns</strong><br>
 *     The UI logic, such as rendering buttons and scrollbars, is decoupled from the creation of concrete components.<br><br>
 *     Example:
 *     <pre><code>Application app = new Application(new WindowsFactory());</code></pre>
 *     The <code>Application</code> class interacts only with abstractions like <code>Button</code> and <code>ScrollBar</code>, not concrete classes. This leads to clean and modular design.
 *   </li>
 *
 *   <li>
 *     <strong>Open/Closed Principle (SOLID)</strong><br>
 *     The system is open for extension but closed for modification. New UI platforms (like <code>LinuxFactory</code> or <code>AndroidFactory</code>) can be added without modifying existing logic — only new factory classes implementing <code>UIFactory</code> need to be introduced.
 *   </li>
 *
 *   <li>
 *     <strong>Easy to Maintain</strong><br>
 *     When a bug or visual update is required (e.g., in <code>MacScrollBar</code>), changes are localized to that specific component. In contrast, without the pattern, developers often need to alter <code>if-else</code> logic scattered in the application, increasing maintenance risk.
 *   </li>
 *
 *   <li>
 *     <strong>Polymorphism and Decoupling</strong><br>
 *     The <code>Application</code> class depends on abstractions rather than concrete implementations.<br><br>
 *     Example:<br>
 *     <pre><code>
 * public Application(UIFactory uiFactory) {
 *     this.button = uiFactory.createButton();
 *     this.scrollBar = uiFactory.createScrollBar();
 * }
 *     </code></pre>
 *     This allows the use of mock factories in unit testing and promotes flexibility.
 *   </li>
 *
 *   <li>
 *     <strong>Scalable and Reusable</strong><br>
 *     The pattern is adaptable across different use cases:<br>
 *     <ul>
 *       <li>Desktop apps with <code>LightThemeFactory</code> and <code>DarkThemeFactory</code></li>
 *       <li>Games with <code>DesertWorldFactory</code> and <code>ForestWorldFactory</code></li>
 *       <li>Cross-platform apps using <code>HTMLFactory</code>, <code>AndroidFactory</code>, or <code>iOSFactory</code></li>
 *     </ul>
 *   </li>
 *
 *   <li>
 *     <strong>Dynamic UI Selection</strong><br>
 *     Factories can be selected at runtime based on user input or configuration settings:<br><br>
 *     <pre><code>
 * UIFactory factory;
 * if (config.equals("mac")) {
 *     factory = new MacFactory();
 * } else {
 *     factory = new WindowsFactory();
 * }
 *     </code></pre>
 *     The application's core logic remains unchanged; only the factory instance varies.
 *   </li>
 * </ol>
 */

public class WithAbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println("------- With Abstract Factory Pattern -------");

        // Use Windows UI
        UIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.renderUI();

        System.out.println();

        // Use Mac UI
        UIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.renderUI();

    }
}
