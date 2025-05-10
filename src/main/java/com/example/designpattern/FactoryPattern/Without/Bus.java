package com.example.designpattern.FactoryPattern.Without;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Bus");
    }
}
