package com.example.designpattern.RideSharingProject.BadCodeExample;

import java.util.ArrayList;
import java.util.List;

public class RideSharingAppService {
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();

    // Methods to add Drivers and Passengeers
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Booking Ride
    public void bookRide(Passenger passenger, double distance) {
        // corner cases
        if (drivers.isEmpty()) {
            System.out.println("No drivers available for " + passenger.getName());
            return;
        }
        // Hard-coded assignment logic
        // find the nearest driver
        // O(N) Brute Force
        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;

        // Closest rider priority, not the cost
        for (Driver driver : drivers) {
            double currentDriverDistance = calculateDistance(passenger.getLocation(), driver.getLocation());
            if (minDistance > currentDriverDistance) {
                minDistance = currentDriverDistance;
                assignedDriver = driver;
            }
        }
        // Fare Calculation
        double expectedFare = calculateFare(assignedDriver.getVehicle(), distance);

        System.out.println("Ride booked for \"" + passenger.getName() + "\", Driver \"" + assignedDriver.getDriverName()
            + "\" with fare = " + expectedFare);

        System.out.println("Driver is on the way! Vehicle type: " + assignedDriver.getVehicle().getType()
                + ", NumberPlate: \"" + assignedDriver.getVehicle().getNumberPlate() + "\"\n");
    }

    private double calculateFare(Vehicle vehicle, double distance) {
        if (vehicle.getType().equals("car")) {
            return 20 * distance;
        } else if (vehicle.getType().equals("bike")) {
            return 10 * distance;
        } else {
            return 50 * distance;
        }

    }

    private double calculateDistance(Location location1, Location location2) {
        // Euclidian Distance
        double dx = location1.getLongitude() - location2.getLongitude();
        double dy = location1.getLatitude() - location2.getLatitude();
        return Math.sqrt(dx * dx + dy * dy);

        // Haversine Formula (2 points on sphere)
    }
}
