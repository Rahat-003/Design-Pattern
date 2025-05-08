package com.example.designpattern.SingletonPattern;

public class SingletonPatternMain {
    public static void main(String[] args) {
        System.out.println("---------- With Singleton Pattern ----------");

        AppSettings appSettings1 = AppSettings.getInstance();
        AppSettings appSettings2 = AppSettings.getInstance();

        System.out.println("Only one instance created: " + (appSettings1 == appSettings2));
    }
}
