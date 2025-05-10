package com.example.designpattern.FactoryPattern.With;

import com.example.designpattern.FactoryPattern.Without.Transport;

public class WithFactoryPattern {
    public static void main(String[] args) {
        System.out.println("-------- With Factory Pattern --------");

        Transport vehicle = TransportFactory.createTransport("bus");
        vehicle.deliver();
    }
}
