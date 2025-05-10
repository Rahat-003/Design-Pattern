package com.example.designpattern.FactoryPattern.Without;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by Car");
    }
}
