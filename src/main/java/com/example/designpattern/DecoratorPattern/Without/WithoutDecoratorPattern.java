package com.example.designpattern.DecoratorPattern.Without;

import com.example.designpattern.DecoratorPattern.Pizza;


/**
 * <h1>🍕 Problem Statement: Why the Decorator Pattern is Needed</h1>
 *
 * <p>
 * In a simple pizza ordering system, the initial implementation offers only a basic pizza.
 * As more toppings like <strong>cheese</strong>, <strong>olives</strong>, <strong>tomatoes</strong>, or <strong>mushrooms</strong> are introduced,
 * the system must support dynamic and flexible topping combinations.
 * </p>
 *
 * <p>
 * A naive approach uses inheritance to model these variations:
 * </p>
 *
 * <ul>
 *   <li><code>CheesePizza</code> extends <code>BasicPizza</code></li>
 *   <li><code>OlivePizza</code> extends <code>BasicPizza</code></li>
 *   <li><code>CheeseOlivePizza</code> extends <code>CheesePizza</code></li>
 *   <li>... and so on for every new combination</li>
 * </ul>
 *
 * <h2>🚫 Problems with the Inheritance-based Approach</h2>
 *
 * <ul>
 *   <li>
 *     <strong>1. Class Explosion:</strong><br>
 *     Every new combination of toppings requires a new subclass.<br>
 *     <em>Example:</em> With 4 toppings, we may need up to 2⁴ = 16 different classes.
 *   </li>
 *
 *   <li>
 *     <strong>2. Code Duplication:</strong><br>
 *     Each topping subclass duplicates logic like cost addition and description updates.
 *     <pre>{@code
 *     @Override
 *     public double getCost() {
 *         return super.getCost() + 1.25;
 *     }
 *     }</pre>
 *   </li>
 *
 *   <li>
 *     <strong>3. Rigid Structure:</strong><br>
 *     Toppings are hardcoded and cannot be added or removed dynamically at runtime.
 *     <pre>{@code
 *     Pizza p = new CheeseOlivePizza(); // Must know all toppings at compile time
 *     }</pre>
 *   </li>
 *
 *   <li>
 *     <strong>4. Tight Coupling:</strong><br>
 *     Subclasses are tightly coupled to specific parent classes (e.g., CheeseOlivePizza depends on CheesePizza),
 *     making changes brittle and hard to isolate.
 *   </li>
 *
 *   <li>
 *     <strong>5. ❌ Violation of Open/Closed Principle:</strong><br>
 *     The Open/Closed Principle states: “Software entities should be open for extension, but closed for modification.”
 *     This principle is violated in two critical ways:
 *     <ul>
 *         <li>
 *             <strong>a. New Toppings Require New Classes:</strong><br>
 *             Developers must create entirely new subclasses for new toppings and their combinations.
 *             <pre>{@code
 *             class MushroomPizza extends BasicPizza { ... }
 *             class CheeseMushroomPizza extends CheesePizza { ... }
 *             class CheeseOliveMushroomPizza extends CheeseOlivePizza { ... }
 *             }</pre>
 *         </li>
 *         <li>
 *             <strong>b. Existing Classes Must Be Modified:</strong><br>
 *             Contrary to belief, inheritance-based designs often lead to editing existing classes:
 *             <ul>
 *                 <li>
 *                     📌 <em>Business logic changes:</em> Updating cheese price from $1.25 to $1.50 means modifying <code>CheesePizza</code>.
 *                 </li>
 *                 <li>
 *                     🧪 <em>Bug fixes or enhancements:</em> If <code>OlivePizza</code> forgets to append "Olive" to the description, the class must be edited.
 *                 </li>
 *                 <li>
 *                     🔄 <em>Global changes:</em> If all pizzas must now include tax or discounts, common logic in base or intermediate classes must be modified.
 *                 </li>
 *             </ul>
 *             These edits directly modify existing, previously working code — a clear breach of the Open/Closed Principle.
 *         </li>
 *     </ul>
 *   </li>
 * </ul>
 *
 * <h2>✅ Solution: Decorator Pattern</h2>
 *
 * <p>
 * The <strong>Decorator Pattern</strong> solves all of the above problems by enabling dynamic composition of toppings at runtime.
 * Instead of subclassing, toppings are implemented as decorators that wrap a <code>Pizza</code> object.
 * </p>
 *
 * <ul>
 *   <li>New toppings = new decorator classes (no existing code modified)</li>
 *   <li>Toppings can be added, removed, or layered dynamically</li>
 *   <li>Code remains flexible, testable, and easy to extend</li>
 *   <li>Fully adheres to the Open/Closed Principle</li>
 * </ul>
 *
 * <h3>🎯 Example with Decorator:</h3>
 * <pre>{@code
 * Pizza pizza = new BasicPizza();
 * pizza = new CheeseTopping(pizza);
 * pizza = new OliveTopping(pizza);
 * System.out.println(pizza.getDescription()); // Basic Pizza, Cheese, Olive
 * }</pre>
 *
 * <p>
 * No need to modify existing classes to add new behavior — you simply wrap them.
 * This keeps your system <strong>open for extension</strong> and <strong>closed for modification</strong>.
 * </p>
 */

public class WithoutDecoratorPattern {
    public static void main(String[] args) {
        System.out.println("------ Without Decorator Pattern ------");

        Pizza pizza = new CheeseOlivePizza();

        System.out.println(pizza.getDescription());
        System.out.println("Price : " + pizza.getCost());


    }
}
