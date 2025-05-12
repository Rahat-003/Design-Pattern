package com.example.designpattern.DecoratorPattern.Without;

public class CheeseOlivePizza extends CheesePizza{
    @Override
    public String getDescription() {
        return super.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }

    public void hello() {
        System.out.println("Hello CheeseOlivePizza");
    }
}
