package com.example.designpattern.RideSharingProject;

public class Bike implements Transport{

    @Override
    public void deliver() {
        System.out.println("Ride Sharing by Bike");
    }
}
