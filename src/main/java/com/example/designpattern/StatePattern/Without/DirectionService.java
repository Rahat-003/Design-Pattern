package com.example.designpattern.StatePattern.Without;

enum TransportationMode {
    WALKING,
    CYCLING,
    CAR,
    TRAIN
}

public class DirectionService {
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void setMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    // Method to calculate ETA (Expected Time of Arrival) based on transportation mode
    public int getETA() {
        switch (transportationMode) {
            case WALKING:
                System.out.println("Calculating ETA for Walking = 10 BDT");
                return 10;

            case CYCLING:
                System.out.println("Calculating ETA for Cycling = 20 BDT");
                return 20;

            case CAR:
                System.out.println("Calculating ETA for Car = 450 BDT");
                return 450;

            case TRAIN:
                System.out.println("Calculating ETA for Train = 60 BDT");
                return 60;

            default:
                throw new IllegalArgumentException("Unknown TransportationMode");
        }
    }

    public String getDirection() {
        switch (transportationMode) {
            case WALKING:
                return "GET Walking Direction: 400m straight";
            case CYCLING:
                return "GET Cycling Direction: travel 1 km";
            case CAR:
                return "GET Car Direction: travel 8 km";
            case TRAIN:
                return "GET Train Direction: travel 50 km";
            default:
                throw new IllegalArgumentException("No direction available for the selected transportation mode");
        }
    }


}
