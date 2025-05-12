package com.example.designpattern.DecoratorPattern.With;

import com.example.designpattern.DecoratorPattern.BasicPizza;
import com.example.designpattern.DecoratorPattern.Pizza;
import com.example.designpattern.DecoratorPattern.Without.CheesePizza;



/**
 * Demonstrates the use of the Decorator Design Pattern to dynamically enhance
 * a basic pizza with additional toppings without altering existing code.
 *
 * <p>The Decorator Pattern enables runtime composition of behaviors
 * by wrapping objects with additional functionality, promoting adherence to
 * the Open/Closed Principle.</p>
 *
 * <p><b>How the Decorator Pattern helps in this context (with code examples):</b></p>
 * <ul>
 *     <li>
 *         <b>Problem:</b> Developers need to support various combinations of pizza toppings
 *         without creating a new class for every possible configuration.<br>
 *         <b>Solution:</b> Allows dynamic layering of features using decorators.
 *         <pre>{@code
 * Pizza pizza = new BasicPizza();
 * pizza = new CheeseDecorator(pizza);
 * pizza = new MushroomDecorator(pizza);
 * pizza = new OliveDecorator(pizza);
 * }</pre>
 *         This eliminates the need for rigid classes like `CheeseMushroomOlivePizza`.
 *     </li>
 *
 *     <li>
 *         <b>Problem:</b> Codebase must remain adaptable to future toppings.<br>
 *         <b>Solution:</b> New toppings can be added by creating new decorators:
 *         <pre>{@code
 * public class JalapenoDecorator extends PizzaDecorator {
 *     public JalapenoDecorator(Pizza pizza) {
 *         super(pizza);
 *     }
 *
 *     @Override
 *     public String getDescription() {
 *         return decoratedPizza.getDescription() + ", Jalapeno";
 *     }
 *
 *     @Override
 *     public double getCost() {
 *         return decoratedPizza.getCost() + 0.75;
 *     }
 * }
 * }</pre>
 *         This supports <b>scalability</b> without modifying existing logic.
 *     </li>
 *
 *     <li>
 *         <b>Problem:</b> The system must be easy to understand and modify.<br>
 *         <b>Solution:</b> Each topping is implemented in its own class:
 *         <pre>{@code
 * public class CheeseDecorator extends PizzaDecorator {
 *     public CheeseDecorator(Pizza pizza) {
 *         super(pizza);
 *     }
 *
 *     @Override
 *     public String getDescription() {
 *         return decoratedPizza.getDescription() + ", Cheese";
 *     }
 *
 *     @Override
 *     public double getCost() {
 *         return decoratedPizza.getCost() + 0.5;
 *     }
 * }
 * }</pre>
 *         This ensures <b>maintainability</b> through separation of concerns.
 *     </li>
 *
 *     <li>
 *         <b>Problem:</b> Features need to be tested in isolation and combination.<br>
 *         <b>Solution:</b> Decorators can be tested like this:
 *         <pre>{@code
 * Pizza pizza = new BasicPizza();
 * Pizza cheese = new CheeseDecorator(pizza);
 * assert cheese.getCost() == 5.5;
 *
 * Pizza full = new OliveDecorator(new MushroomDecorator(cheese));
 * assert full.getDescription().contains("Cheese, Mushroom, Olive");
 * }</pre>
 *         This improves <b>testability</b> and confidence in individual toppings.
 *     </li>
 *
 *     <li>
 *         <b>Problem:</b> The system must allow runtime behavior changes.<br>
 *         <b>Solution:</b> Composition is performed at runtime:
 *         <pre>{@code
 * List<String> userToppings = List.of("Cheese", "Olive");
 * Pizza pizza = new BasicPizza();
 * for (String topping : userToppings) {
 *     if (topping.equals("Cheese")) pizza = new CheeseDecorator(pizza);
 *     else if (topping.equals("Olive")) pizza = new OliveDecorator(pizza);
 * }
 * }</pre>
 *         This demonstrates the <b>flexibility</b> of the pattern for dynamic scenarios.
 *     </li>
 * </ul>
 *
 * <p>This class acts as the client, combining a {@code BasicPizza} with several decorators
 * such as {@code CheeseDecorator}, {@code MushroomDecorator}, and {@code OliveDecorator},
 * showcasing modular design, reusability, and clean object composition.</p>
 *
 * @see BasicPizza
 * @see CheeseDecorator
 * @see MushroomDecorator
 * @see OliveDecorator
 */

public class WithDecoratorPattern {
    public static void main(String[] args) {
        System.out.println("------ With Decorator Pattern ------");

        // Basic Pizza
        Pizza pizza = new BasicPizza();

        // Add Cheese + Olive + Mushroom
        pizza = new CheeseDecorator(pizza);
        pizza = new MushroomDecorator(pizza);
        pizza = new OliveDecorator(pizza);


        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
