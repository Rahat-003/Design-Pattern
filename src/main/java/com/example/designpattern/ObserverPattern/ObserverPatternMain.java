package com.example.designpattern.ObserverPattern;

import org.springframework.boot.SpringApplication;

public class ObserverPatternMain {
    public static void main(String[] args) {
        System.out.println("------------- ObserverPatternMain -------------");

        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice displayDevice = new DisplayDevice();
        MobileDevice mobileDevice = new MobileDevice();


        weatherStation.addObserver(displayDevice);
        weatherStation.addObserver(mobileDevice);

        weatherStation.setTemperature(150);

        weatherStation.deleteObserver(displayDevice);

        weatherStation.setTemperature(100);

    }
}
