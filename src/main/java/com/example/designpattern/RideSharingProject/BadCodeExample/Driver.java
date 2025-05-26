package com.example.designpattern.RideSharingProject.BadCodeExample;

public class Driver {
    private String driverName;
    private Vehicle vehicle;
    private Location location;

    public Driver(String driverName, Location location, Vehicle vehicle) {
        this.driverName = driverName;
        this.location = location;
        this.vehicle = vehicle;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDriverName() {
        return driverName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
