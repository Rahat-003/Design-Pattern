package com.example.designpattern.RideSharingProject.GoodCodeExample;

public class Ride {
    private Passenger passenger;
    private Driver driver;
    private FareStrategy fareStrategy;
    private RideStatus rideStatus;
    private double distance;
    private double fare;

    public Ride(Passenger passenger, Driver driver, FareStrategy fareStrategy, double distance) {
        this.passenger = passenger;
        this.driver = driver;
        this.fareStrategy = fareStrategy;
        this.distance = distance;
        this.rideStatus = RideStatus.SCHEDULED;
    }

    public void calculateFare() {
        this.fare = fareStrategy.calculateFare(driver.getVehicle(), distance);
    }

    public void updateStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
        notifyUsers(rideStatus);
    }

    private void notifyUsers(RideStatus rideStatus) {
        passenger.notify("[Passenger] Your ride is " + rideStatus);
        driver.notify("[Driver] Your ride is " + rideStatus);
    }

    public double getFare() {
        return fare;
    }

}
