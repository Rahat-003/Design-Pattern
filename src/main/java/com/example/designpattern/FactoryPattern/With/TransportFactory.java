package com.example.designpattern.FactoryPattern.With;

import com.example.designpattern.FactoryPattern.Without.Bike;
import com.example.designpattern.FactoryPattern.Without.Bus;
import com.example.designpattern.FactoryPattern.Without.Car;
import com.example.designpattern.FactoryPattern.Without.Transport;

public class TransportFactory {
    public static Transport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bus":
                return new Bus();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unsupported Transport Type");
        }

    }
}
