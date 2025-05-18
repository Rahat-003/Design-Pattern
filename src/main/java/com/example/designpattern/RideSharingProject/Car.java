package com.example.designpattern.RideSharingProject;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Ride sharing by Car");
    }
}
