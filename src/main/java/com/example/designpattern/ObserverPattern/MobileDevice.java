package com.example.designpattern.ObserverPattern;

public class MobileDevice implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("Temperature on MobileDevice: " + temp);

    }
}
