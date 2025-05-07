package com.example.designpattern.StatePattern.With;

public class Car implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for Car = 450 BDT");
        return 450;
    }

    @Override
    public String getDirection() {
        return "GET Car Direction: travel 8 km";
    }
}
