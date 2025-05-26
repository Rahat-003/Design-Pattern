package com.example.designpattern.RideSharingProject.BadCodeExample;

public class Vehicle {
    private String numberPlate;
    private String type;

    public Vehicle(String numberPlate, String type) {
        this.numberPlate = numberPlate;
        this.type = type;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getType() {
        return type;
    }


}
