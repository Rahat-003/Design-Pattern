package com.example.designpattern.StatePattern.With;

public class Train implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA for Train = 60 BDT");
        return 60;
    }

    @Override
    public String getDirection() {
        return "GET Train Direction: travel 50 km";
    }
}
