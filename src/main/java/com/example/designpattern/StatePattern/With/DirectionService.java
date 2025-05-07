package com.example.designpattern.StatePattern.With;

public class DirectionService {
    TransportationMode transportationMode;
    DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }
    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }
    public int getETA() {
        return transportationMode.calcETA();
    }

    public String getDirection() {
        return transportationMode.getDirection();
    }
}
