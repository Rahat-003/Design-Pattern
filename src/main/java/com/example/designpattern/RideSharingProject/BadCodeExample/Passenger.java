package com.example.designpattern.RideSharingProject.BadCodeExample;

public class Passenger {
    private String name;
    private Location location;

    public Passenger(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
}
