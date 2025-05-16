package com.example.designpattern.ProxyPattern.Without;

import com.example.designpattern.ProxyPattern.Image;
import com.example.designpattern.ProxyPattern.RealImage;


/**
 * <h1>Problems Without Using the Proxy Pattern</h1>
 *
 * <p>
 * This example demonstrates an image viewer application where images are instantiated directly using
 * {@link RealImage}. Although this works functionally, it leads to significant performance and design issues
 * when the Proxy Pattern is not used.
 * </p>
 *
 * <h2>Drawbacks of Not Using the Proxy Pattern</h2>
 *
 * <p><strong>1. Expensive Resource Usage (Eager Loading)</strong><br>
 * Every time a {@link RealImage} is created, it immediately loads the image from disk—even if the image is never displayed.
 * This leads to unnecessary disk I/O and memory usage, which can be costly when dealing with large files or many images.
 * </p>
 *
 * <pre>{@code
 * Image img = new RealImage("cat.png"); // Triggers disk load immediately
 * }</pre>
 *
 * <p><strong>2. No Lazy Loading</strong><br>
 * The image loading is not deferred until it’s actually needed (e.g., when <code>display()</code> is called).
 * This removes the opportunity to optimize performance by loading only when required.
 * </p>
 *
 * <p><strong>3. No Caching or Reuse</strong><br>
 * Each time a new {@link RealImage} is created for the same file, the image is loaded again from disk.
 * This causes repeated, redundant operations even for the same file, wasting both time and resources.
 * </p>
 *
 * <pre>{@code
 * Image img1 = new RealImage("cat.png"); // Loads from disk
 * Image img2 = new RealImage("cat.png"); // Loads again from disk
 * }</pre>
 *
 * <p><strong>4. Tight Coupling to RealImage</strong><br>
 * The client code is directly dependent on the {@link RealImage} class. Any additional behavior such as access control,
 * logging, or caching must be added by modifying the RealImage class or its usage, making the system harder to maintain.
 * </p>
 *
 * <p><strong>5. Violation of the Open/Closed Principle</strong><br>
 * The design violates the Open/Closed Principle, which states: “Software entities should be open for extension, but closed for modification.”<br>
 * To introduce new behavior (like lazy loading or caching), developers are forced to change existing code, either in the {@code RealImage}
 * class or in client classes. This makes the system fragile and less adaptable to future changes.
 * </p>
 *
 * <h2>Solution: Apply the Proxy Pattern</h2>
 *
 * <p>
 * The Proxy Pattern provides a wrapper class (e.g., <code>ProxyImage</code>) that controls access to the real object.
 * It enables:
 * </p>
 * <ul>
 *   <li>Lazy loading – load the image only when needed</li>
 *   <li>Caching – avoid reloading the same image repeatedly</li>
 *   <li>Access control, logging, performance monitoring, etc.</li>
 *   <li>Compliance with the Open/Closed Principle – add new behavior without modifying existing classes</li>
 * </ul>
 */

public class WithoutProxyPattern {

    public static void main(String[] args) {
        System.out.println("-------- Without Proxy Pattern --------");

        Image img1 = new RealImage("cat.png");
        Image img2 = new RealImage("cat.png");

        img2.display();
    }
}
