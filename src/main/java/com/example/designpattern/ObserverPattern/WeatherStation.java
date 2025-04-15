package com.example.designpattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private List<Observer> observerList;

    WeatherStation(){
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObserver();
    }


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver(){
        for(Observer observer : observerList){
            observer.update(temperature);
        }
    }

    public void showObserverInfo() {
        for(Observer observer : observerList){
            System.out.println();
        }
    }

}
