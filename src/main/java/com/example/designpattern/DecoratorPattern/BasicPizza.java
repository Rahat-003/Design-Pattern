package com.example.designpattern.DecoratorPattern;

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
