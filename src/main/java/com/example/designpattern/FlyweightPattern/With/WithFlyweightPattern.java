package com.example.designpattern.FlyweightPattern.With;









/**
 * Demonstrates the <b>Flyweight Design Pattern</b> by efficiently reusing common properties (color)
 * of bullets across multiple bullet instances, minimizing memory usage.
 *
 * <p>
 * In this example, bullets are frequently created with the same color (intrinsic state) but different
 * positions and velocities (extrinsic state). Instead of duplicating the color property in each bullet
 * instance, we use a factory to reuse shared {@code BulletType} objects. This is especially useful
 * when working with a large number of similar objects.
 * </p>
 *
 * <h2>Design Pattern: Flyweight</h2>
 * <p>
 * Flyweight is a structural pattern that allows sharing common parts of object state between multiple objects.
 * </p>
 *
 * <h3>Pattern Participants:</h3>
 * <ul>
 *   <li><b>Flyweight:</b> {@code BulletType} (stores shared, intrinsic state like color)</li>
 *   <li><b>Concrete Flyweight:</b> Instances of {@code BulletType}</li>
 *   <li><b>Flyweight Factory:</b> {@code BulletTypeFactory} (creates and manages flyweight objects)</li>
 *   <li><b>Client:</b> {@code WithFlyweightPattern} and {@code Bullet} (uses shared flyweight instances)</li>
 * </ul>
 *
 * <h2>Key Best Practices Followed:</h2>
 * <ul>
 *   <li><b>Separation of concerns:</b> Intrinsic state (color) is managed separately from extrinsic state (position, velocity).</li>
 *   <li><b>Factory reuse:</b> {@code BulletTypeFactory} caches flyweight objects to avoid redundant object creation.</li>
 *   <li><b>Encapsulation:</b> {@code BulletType} hides its internal state and creation logic is encapsulated in the factory.</li>
 *   <li><b>Memory Optimization:</b> Avoids redundant memory usage by reusing shared state.</li>
 * </ul>
 *
 * <h2>SOLID Principles Demonstrated:</h2>
 * <ul>
 *   <li><b>S – Single Responsibility Principle:</b> Each class has a single responsibility:
 *       <ul>
 *           <li>{@code Bullet} holds position and velocity</li>
 *           <li>{@code BulletType} represents shared visual attributes</li>
 *           <li>{@code BulletTypeFactory} manages instance creation and caching</li>
 *       </ul>
 *   </li>
 *   <li><b>O – Open/Closed Principle:</b> New bullet types can be added without modifying existing code.</li>
 *   <li><b>D – Dependency Inversion Principle:</b> {@code Bullet} depends on the abstraction {@code BulletType}, not on how it is created.</li>
 * </ul>
 *
 * <h2>Output Example:</h2>
 * <pre>
 * Created Bullet of color: Red
 * Created bullet at positionX: 10, positionY: 20, velocity: 50
 * ...
 * Created Bullet of color: Green
 * Created bullet at positionX: 10, positionY: 20, velocity: 50
 * </pre>
 *
 * <h2>Real-World Use Cases:</h2>
 * <ul>
 *   <li><b>Game Engines:</b> Rendering many similar objects (e.g., bullets, enemies, trees, clouds)</li>
 *   <li><b>Text Editors:</b> Reusing character glyphs instead of creating new ones for each character</li>
 *   <li><b>IDE Syntax Highlighting:</b> Reusing token styles (e.g., keywords, literals) to reduce memory usage</li>
 *   <li><b>Map Rendering:</b> Reusing icons and labels across thousands of markers</li>
 *   <li><b>Document Rendering:</b> Sharing paragraph styles, headers, or formatting rules</li>
 * </ul>
 *
 * <h2>Conclusion:</h2>
 * This implementation is a standard and practical application of the Flyweight Pattern. It adheres to clean code principles,
 * respects object-oriented design, and is optimized for performance and scalability.
 */
public class WithFlyweightPattern {
    public static void main(String[] args) {
        System.out.println("------- With Flyweight Pattern -------");

        // 5 red bullets
        // Same color bullet is only created once
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("Red", 10 + i, 20 + i, 50 + 10 * i);
            bullet.display();
        }

        System.out.println();

        // 5 green bullets
        // Same color bullet is only created once
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("Green", 10 + i, 20 + i, 50 + 10 * i);
            bullet.display();
        }

    }
}
