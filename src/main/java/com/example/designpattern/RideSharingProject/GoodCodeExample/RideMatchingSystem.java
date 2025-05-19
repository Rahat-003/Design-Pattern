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
        passenger.notify("Ride scheduled successfully!");
    }


}
