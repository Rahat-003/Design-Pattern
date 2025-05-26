package com.example.designpattern.RideSharingProject.GoodCodeExample;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double calculateDistance(Location destinationLocation) {
        // Euclidian Distance
        double dx = longitude - destinationLocation.getLongitude();
        double dy = latitude - destinationLocation.getLatitude();
        return Math.sqrt(dx * dx + dy * dy);
        // Haversine Formula (2 points on sphere)
    }


    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
