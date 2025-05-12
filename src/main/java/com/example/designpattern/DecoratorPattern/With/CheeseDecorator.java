package com.example.designpattern.DecoratorPattern.With;

import com.example.designpattern.DecoratorPattern.Pizza;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 0.5;
    }
}
