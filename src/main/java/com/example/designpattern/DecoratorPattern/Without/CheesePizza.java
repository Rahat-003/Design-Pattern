package com.example.designpattern.DecoratorPattern.Without;

import com.example.designpattern.DecoratorPattern.BasicPizza;

public class CheesePizza extends BasicPizza {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.25;
    }
}
