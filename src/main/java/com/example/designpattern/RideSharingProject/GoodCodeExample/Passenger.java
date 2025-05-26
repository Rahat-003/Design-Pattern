package com.example.designpattern.RideSharingProject.GoodCodeExample;


public class Passenger extends User {
    public Passenger(String name, String email, Location location) {
        super(name, email, location);
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public void notify(String message) {

    }
}
