package com.example.designpattern.FactoryPattern.Without;

/**
 * <p><strong>It is not that it's incorrect</strong>, but that it's violating key software design principles,
 * especially if you're aiming for scalable, maintainable, and flexible code.
 * Here's what's wrong from a design perspective:</p>
 *
 * <h3>❌ 1. Tight Coupling (Violates Dependency Inversion Principle)</h3>
 * <p>
 * You're tightly coupling your code to concrete classes (<code>Car</code>, <code>Bike</code>, <code>Bus</code>).
 * If the class name or constructor changes, or if you want to switch to a different implementation,
 * you'll need to change every place where it's instantiated.
 * </p>
 * <p><strong>Factory pattern decouples object creation from object usage.</strong></p>
 *
 * <h3>❌ 2. Violates Open/Closed Principle (OCP)</h3>
 * <p>
 * If later you want to add a new transport type (e.g., <code>Truck</code>),
 * you’d have to modify all places in your code where new instances are created —
 * leading to fragile and error-prone code.
 * </p>
 * <ul>
 *   <li>You only change the factory class (if needed)</li>
 *   <li>The calling code stays the same</li>
 * </ul>
 *
 * <h3>❌ 3. Lack of Centralized Object Creation</h3>
 * <p>This makes it:</p>
 * <ul>
 *   <li>Hard to audit or log instance creation</li>
 *   <li>Difficult to inject dependencies (if needed)</li>
 *   <li>Impossible to apply object pooling or caching</li>
 * </ul>
 *
 * <h3>❌ 4. No Abstraction for Creation Logic</h3>
 * <p>
 * Imagine if <code>Car</code>, <code>Bike</code>, and <code>Bus</code> required complex construction logic or parameters —
 * that complexity would pollute your main logic.
 * </p>
 * <p><strong>A factory hides complexity and provides a clean, single interface for object creation.</strong></p>
 */
public class WithoutFactoryPattern {
    public static void main(String[] args) {
        System.out.println("-------- Without Factory Pattern --------");
        Transport car = new Car();
        Transport bike = new Bike();
        Transport bus = new Bus();

    }
}
