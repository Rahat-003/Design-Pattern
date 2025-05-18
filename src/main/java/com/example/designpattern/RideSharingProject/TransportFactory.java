package com.example.designpattern.RideSharingProject;

public class TransportFactory {
    public static Transport getTransport(String transportType) {
        switch (transportType) {
            case "car":
                return new Car();

            case "bike":
                return new Bike();

            default:
                throw new  IllegalArgumentException("Unsupported transport");
        }
    }
}
