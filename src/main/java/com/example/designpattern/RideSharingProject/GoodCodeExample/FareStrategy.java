package com.example.designpattern.RideSharingProject.GoodCodeExample;

public interface FareStrategy {
    double calculateFare(Vehicle vehicle, double distance);
}

class StandardFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance;
    }
}

class SharedFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 0.50;
    }
}

class LuxuryFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 1.5;
    }
}

