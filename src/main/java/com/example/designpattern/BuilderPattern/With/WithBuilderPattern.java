package com.example.designpattern.BuilderPattern.With;

public class WithBuilderPattern {

    public static void main(String[] args) {
        System.out.println("------- With Builder Pattern -------");

        House house = new House.HouseBuilder("Concrete", "Wood", "Butterfly")
                .setGarage(true)
                .setGarden(false)
                .setSwimmingPool(false)
                .build();

        System.out.println(house);
    }
}
