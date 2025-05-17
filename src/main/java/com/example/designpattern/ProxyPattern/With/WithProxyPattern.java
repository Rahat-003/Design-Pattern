package com.example.designpattern.ProxyPattern.With;

import com.example.designpattern.ProxyPattern.Image;




/**
 * <h1>Using the Proxy Pattern for Efficient Resource Management</h1>
 *
 * <p>
 * This implementation demonstrates the <strong>Proxy Design Pattern</strong> to manage expensive object instantiation.
 * The {@link com.example.designpattern.ProxyPattern.With.ProxyImage ProxyImage} acts as a stand-in for the real image,
 * {@link com.example.designpattern.ProxyPattern.RealImage RealImage}, and delays its creation until it's truly needed.
 * </p>
 *
 * <h2>1. Problem It Solves</h2>
 * <p>
 * Without the proxy, creating an image (e.g., <code>new RealImage("cat.png")</code>) loads it from disk immediately,
 * even if it's never displayed. This causes unnecessary memory and CPU usage.
 * </p>
 *
 * <h2>2. Lazy Loading</h2>
 * <p>
 * The real image is not loaded in the constructor. Instead, it's only loaded when <code>display()</code> is called:
 * </p>
 * <pre>{@code
 * Image img = new ProxyImage("cat.png"); // No disk load
 * img.display(); // Disk load happens here
 * }</pre>
 *
 * <h2>3. Caching and Performance Optimization</h2>
 * <p>
 * After the first load, repeated calls to <code>display()</code> reuse the cached image, preventing redundant disk operations:
 * </p>
 * <pre>{@code
 * Image img = new ProxyImage("cat.png");
 * img.display(); // Loads from disk
 * img.display(); // Uses cached RealImage
 * }</pre>
 *
 * <h2>4. Reduced Resource Consumption</h2>
 * <p>
 * If the image is never displayed, it is never loaded—saving I/O, memory, and CPU time.
 * This is especially helpful in applications where many images may never be shown.
 * </p>
 *
 * <h2>5. Separation of Concerns</h2>
 * <p>
 * {@link com.example.designpattern.ProxyPattern.RealImage RealImage} focuses only on disk loading and display logic,
 * while {@link com.example.designpattern.ProxyPattern.With.ProxyImage ProxyImage} manages object creation, caching, and access.
 * </p>
 *
 * <h2>6. Open/Closed Principle Compliance</h2>
 * <p>
 * The design adheres to the Open/Closed Principle. To add new features like access control, logging, or remote image loading,
 * developers can extend the proxy without modifying the original {@link com.example.designpattern.ProxyPattern.RealImage RealImage} class.
 * </p>
 *
 * <h2>7. Class Responsibilities</h2>
 * <ul>
 *   <li><strong>{@link com.example.designpattern.ProxyPattern.Image Image}</strong>: Common interface.</li>
 *   <li><strong>{@link com.example.designpattern.ProxyPattern.RealImage RealImage}</strong>: Loads and displays the image.</li>
 *   <li><strong>{@link com.example.designpattern.ProxyPattern.With.ProxyImage ProxyImage}</strong>: Adds lazy loading and caching.</li>
 * </ul>
 *
 * <h2>8. Related Design Patterns</h2>
 * <ul>
 *   <li><strong>Virtual Proxy</strong>: Delays creation of expensive objects (used here).</li>
 *   <li><strong>Protection Proxy</strong>: Can be used to restrict access based on permissions.</li>
 * </ul>
 *
 * <h2>9. References</h2>
 * <ul>
 *   <li>Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). <em>Design Patterns: Elements of Reusable Object-Oriented Software</em>.</li>
 *   <li><a href="https://refactoring.guru/design-patterns/proxy">Refactoring.Guru - Proxy Pattern</a></li>
 * </ul>
 */

public class WithProxyPattern {
    public static void main(String[] args) {
        System.out.println("------- With Proxy Pattern -------");

        Image img1 = new ProxyImage("cat.png");
        Image img2 = new ProxyImage("cat.png");


        img1.display();
        img1.display();
    }
}
