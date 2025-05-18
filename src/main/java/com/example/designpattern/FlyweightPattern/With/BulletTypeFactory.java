package com.example.designpattern.FlyweightPattern.With;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {
    private static final Map<String, BulletType> bulletTypeMap = new HashMap<>();

    public static BulletType getBulletType(String color) {
        if (!bulletTypeMap.containsKey(color)) {
            bulletTypeMap.put(color, new BulletType(color));
        }
        return bulletTypeMap.get(color);
    }
}
