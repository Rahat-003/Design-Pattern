package com.example.designpattern.DecoratorPattern.With;

import com.example.designpattern.DecoratorPattern.Pizza;

public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
