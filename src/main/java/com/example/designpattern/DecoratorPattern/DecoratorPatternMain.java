package com.example.designpattern.DecoratorPattern;

import com.example.designpattern.DecoratorPattern.With.WithDecoratorPattern;
import com.example.designpattern.DecoratorPattern.Without.WithoutDecoratorPattern;



/**
 * <h2>Problem Statement - Decorator Pattern</h2>
 *
 * <p>
 * Suppose there is a simple <strong>Pizza ordering system</strong>. Initially, it offers only a basic
 * <em>plain pizza</em>. Over time, the system needs to support additional toppings like
 * <em>cheese</em>, <em>olives</em>, <em>tomatoes</em>, and <em>mushrooms</em>.
 * </p>
 *
 * <p>
 * The challenge is to add these features without modifying the existing <code>Pizza</code> class
 * or creating multiple subclasses for every possible combination of toppings (which would lead to a
 * combinatorial explosion and violate the Open/Closed Principle).
 * </p>
 *
 * <p>
 * <strong>Problem:</strong> How can one dynamically and flexibly add new functionalities (like toppings)
 * to objects (like pizzas) without changing the base class or relying on subclassing?
 * </p>
 *
 * <p>
 * <strong>Solution:</strong> Apply the <code>Decorator Pattern</code> to wrap the base pizza
 * object with additional behavior (toppings) at runtime. Each topping can be implemented as a decorator
 * that conforms to the same <code>Pizza</code> interface, allowing dynamic composition.
 * </p>
 */

public class DecoratorPatternMain {
    public static void main(String[] args) {
//        WithoutDecoratorPattern.main(args);
        WithDecoratorPattern.main(args);
    }
}
