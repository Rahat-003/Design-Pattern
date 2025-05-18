package com.example.designpattern.FlyweightPattern.Without;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




/**
 * <h1>WithoutFlyweightPattern</h1>
 * <p>
 * Demonstrates the creation of multiple {@link Bullet} objects without using the Flyweight design pattern.
 * Each bullet instance stores both intrinsic and extrinsic properties, leading to unnecessary duplication
 * of data such as color.
 * </p>
 *
 * <h2>Purpose</h2>
 * <p>
 * This example is meant to highlight the problems that arise when shared data (e.g., color)
 * is not reused efficiently across similar objects.
 * </p>
 *
 * <h2>Problems Highlighted</h2>
 * <ul>
 *   <li><b>Memory Overhead:</b> Each bullet object stores its own copy of the color string,
 *       even if multiple bullets share the same color.</li>
 *   <li><b>Performance Degradation:</b> Increased memory usage and garbage collection pressure
 *       can degrade performance when a large number of bullets are created.</li>
 * </ul>
 *
 * <h2>Violated SOLID Principles</h2>
 * <ul>
 *   <li><b>Single Responsibility Principle (SRP):</b> The {@link Bullet} class handles both
 *       data (intrinsic/extrinsic) and rendering logic (display method).</li>
 *   <li><b>Open/Closed Principle (OCP):</b> The current design makes it difficult to extend
 *       or optimize bullet creation (e.g., reusing shared properties) without modifying the class.</li>
 *   <li><b>Liskov Substitution Principle (LSP):</b> Not directly violated here, but poor separation
 *       may lead to future subclasses violating behavioral expectations.</li>
 *   <li><b>Interface Segregation Principle (ISP):</b> Not applicable as no interfaces are used.</li>
 *   <li><b>Dependency Inversion Principle (DIP):</b> High-level code is tightly coupled to low-level
 *       {@link Bullet} instantiation, without any abstraction or factory usage.</li>
 * </ul>
 *
 */
public class WithoutFlyweightPattern {
    public static void main(String[] args) {
        System.out.println("------- Without Flyweight Pattern -------");

        List<String> colors = new ArrayList<>(
            Arrays.asList(
                "Red",
                "Green",
                "Blue"
            )
        );


        for (int i = 0; i < 10; i++) {
            Bullet bullet = new Bullet(colors.get(i % colors.size()), 10 + i, 30 + i, 100);
            bullet.display();
        }

        // Problems
        // Memory Overhead: Every bullet stores redundant data like color (Intrinsic properties)
        // Performance: Slow performance when many bullets are created

    }
}
