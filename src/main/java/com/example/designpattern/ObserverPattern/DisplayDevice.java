package com.example.designpattern.ObserverPattern;

import java.util.List;

public class DisplayDevice implements Observer{
    private float temperature;
    private String name;


    @Override
    public void update(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature(){
        return this.temperature;
    }

}
