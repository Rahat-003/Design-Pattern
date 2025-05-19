package com.example.designpattern.RideSharingProject.GoodCodeExample;

public class Car extends Vehicle {

    public Car(String numberPlate, String type) {
        super(numberPlate, type);
    }

    @Override
    public double getFarePerKm() {
        return 20;
    }
}
