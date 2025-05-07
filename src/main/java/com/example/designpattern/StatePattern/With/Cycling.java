package com.example.designpattern.StatePattern.With;

public class Cycling implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for Cycling = 20 BDT");
        return 20;
    }

    @Override
    public String getDirection() {
        return "GET Cycling Direction: travel 1 km";
    }
}
