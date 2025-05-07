package com.example.designpattern.StatePattern.Without;

public class WithoutStatePattern {
    public static void main(String[] args) {
        System.out.println("---------- Without State Pattern ----------");

        DirectionService directionService = new DirectionService(TransportationMode.TRAIN);
        System.out.println(directionService.getDirection());
        directionService.getETA();
    }
}
