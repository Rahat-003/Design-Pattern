package com.example.designpattern.RideSharingProject.BadCodeExample;


/**
 * All SOLID principles violated
 */
public class BadCodeMain {

    public static void main(String[] args) {

        System.out.println("------ Bad Code of Ride Sharing Application ------");

        // Driver Location
        Location l1 = new Location(12.97, 43.65);
        Location l2 = new Location(14.65, 65.36);
        Location l3 = new Location(23.58, 32.45);
        Location l4 = new Location(21.87, 36.46);
        Location l5 = new Location(70.79, 86.23);
        Location l6 = new Location(23.15, 54.13);

        // Passenger location
        Location l7 = new Location(86.51, 37.92);
        Location l8 = new Location(32.87, 69.26);
        Location l9 = new Location(75.87, 12.34);



        Vehicle vehicle1 = new Vehicle("Car-361", "car");
        Vehicle vehicle2 = new Vehicle("Car-362", "car");
        Vehicle vehicle3 = new Vehicle("Car-363", "car");
        Vehicle vehicle4 = new Vehicle("Bike-477", "bike");
        Vehicle vehicle5 = new Vehicle("Bike-478", "bike");
        Vehicle vehicle6 = new Vehicle("Bike-479", "bike");


        Driver driver1 = new Driver("Alice", l1, vehicle1);
        Driver driver2 = new Driver("Bob", l2, vehicle2);
        Driver driver3 = new Driver("Charlie", l3, vehicle3);
        Driver driver4 = new Driver("Dan", l4, vehicle4);
        Driver driver5 = new Driver("Eve", l5, vehicle5);
        Driver driver6 = new Driver("Fred", l6, vehicle6);


        Passenger passenger1 = new Passenger("Rahat", l7);
        Passenger passenger2 = new Passenger("Rafi", l8);
        Passenger passenger3 = new Passenger("Hasan", l9);

        RideSharingAppService appService = new RideSharingAppService();

        appService.addDriver(driver1);
        appService.addDriver(driver2);
        appService.addDriver(driver3);
        appService.addDriver(driver4);
        appService.addDriver(driver5);
        appService.addDriver(driver6);

        appService.addPassenger(passenger1);
        appService.addPassenger(passenger2);
        appService.addPassenger(passenger3);

        appService.bookRide(passenger1, 50);
        appService.bookRide(passenger2, 60);
        appService.bookRide(passenger3, 70);


    }
}
