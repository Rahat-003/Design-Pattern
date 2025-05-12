package com.example.designpattern.DecoratorPattern.Without;

import com.example.designpattern.DecoratorPattern.Pizza;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
