package com.example.designpattern.RideSharingProject.GoodCodeExample;

public class Bike extends Vehicle {


    public Bike(String numberPlate, String type) {
        super(numberPlate, type);
    }

    @Override
    public double getFarePerKm() {
        return 10;
    }
}
