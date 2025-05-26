package com.example.designpattern.RideSharingProject.GoodCodeExample;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {

    private List<Driver> availableDrivers;

    public RideMatchingSystem() {
        availableDrivers = new ArrayList<Driver>();
    }

    public void addDriver(Driver driver) {
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) {
        if (availableDrivers.size() == 0) {
            // mechanism to notify the passenger
            passenger.notify("No drivers are available");
            return;
        }

        // Find the nearest driver available
        Driver nearestDriver = findNearestDriver(passenger.getLocation());

        // Mediator
        availableDrivers.remove(nearestDriver);
        Ride ride = new Ride(passenger, nearestDriver, fareStrategy, distance);
        ride.calculateFare();
        passenger.notify("Ride scheduled successfully with fare: BDT" + ride.getFare());
        nearestDriver.notify("You have a new ride request for " + ride.getFare());

        // Update the status of the ride
        ride.updateStatus(RideStatus.ONGOING);

        // Change the status of ride after ride is finished
        ride.updateStatus(RideStatus.COMPLETED);
        availableDrivers.add(nearestDriver);
    }

    private Driver findNearestDriver(Location passengerLocation) {
        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;
        for (Driver driver : availableDrivers) {
            double distance = driver.getLocation().calculateDistance(passengerLocation);
            if (distance < minDistance) {
                minDistance = distance;
                assignedDriver = driver;
            }
        }
        return assignedDriver;
    }


}
