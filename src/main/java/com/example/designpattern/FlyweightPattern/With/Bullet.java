package com.example.designpattern.FlyweightPattern.With;


public class Bullet {
    private BulletType bulletType;

    // Extrinsic property. (Different for different bullets)
    private int x;
    private int y;
    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.bulletType = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }

    public void display() {
        System.out.println("Created bullet at positionX: " + x + ", positionY: " + y +
                ", velocity: " + velocity);
    }


    @Override
    public String toString() {
        return "Bullet: {" +
                "color='" + bulletType.getColor() + '\'' +
                ", positionX=" + x +
                ", positionY=" + y +
                ", velocity=" + velocity +
                '}';
    }
}

