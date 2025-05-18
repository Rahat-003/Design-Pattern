package com.example.designpattern.FlyweightPattern.With;

public class BulletType {
    // Intrinsic properties. (Same for all bullet, don't need to create these properties every time)
    private String color;

    BulletType(String color) {
        this.color = color;
        System.out.println("Created Bullet of color: " + color);
    }
    public String getColor() {
        return color;
    }
}
