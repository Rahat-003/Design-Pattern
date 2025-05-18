package com.example.designpattern.FlyweightPattern.Without;

public class Bullet {
    private String color;   // Intrinsic property. (Same for all bullet)

    // Extrinsic property. (Different for different bullets)
    private int x;
    private int y;
    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }

    public void display() {
        System.out.println("Bullet is at positionX: " + x + ", positionY: " + y +
                ", velocity: " + velocity + ", color: " + color);
    }


    @Override
    public String toString() {
        return "Bullet{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", velocity=" + velocity +
                '}';
    }
}
