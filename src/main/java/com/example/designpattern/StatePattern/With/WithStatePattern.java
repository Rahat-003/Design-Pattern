package com.example.designpattern.StatePattern.With;

public class WithStatePattern {
    public static void main(String[] args) {
        System.out.println("-------- With State Pattern --------");

        DirectionService directionService = new DirectionService(new Car());
        directionService.setTransportationMode(new Cycling());

        System.out.println("_______ETA: " + directionService.getETA());
        System.out.println("_______Direction: " + directionService.getDirection());
    }
}
