package com.example.designpattern.BuilderPattern.Without;

public class WithoutBuilderPattern {
    public static void main(String[] args) {
        System.out.println("--------- Without Builder Pattern ---------");

        House house = new House("Concrete", "Wood", "Dutch gable", true, false, true);
        House house2 = new House("Basement", "Framed", "Butterfly", false, true, true);
        // Constructor Explosion -> Too many constructors
        // Difficult to understand & maintain code
        // Builder pattern solves this problem of having too many parameters inside constructor
        System.out.println(house);
        System.out.println(house2);
    }
}
