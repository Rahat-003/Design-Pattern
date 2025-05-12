package com.example.designpattern.DecoratorPattern.With;

import com.example.designpattern.DecoratorPattern.Pizza;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 2.5;
    }
}
