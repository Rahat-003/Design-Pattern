package com.example.designpattern.FactoryPattern.Without;

public class Bike implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Bike.");
    }
}
