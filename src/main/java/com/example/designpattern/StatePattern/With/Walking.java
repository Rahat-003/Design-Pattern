package com.example.designpattern.StatePattern.With;

public class Walking implements TransportationMode{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA - Walking 10 BDT");
        return 10;
    }

    @Override
    public String getDirection() {
        return "GET Walking Direction: 400m straight";
    }
}
