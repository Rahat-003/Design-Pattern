package com.example.designpattern.RideSharingProject.GoodCodeExample;

public class GoodCodeMain {


    /**
     * https://github.com/prateek27/design-patterns-java/tree/main/design-patterns/src/main/java/org/prateek/LLDProject/RideSharingApp/V2
     */
    public static void main(String[] args) {

        System.out.println("------- GoodCodeMain -------");

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


        Vehicle car1 = new Car("Car-361");
        Vehicle car2 = new Car("Car-362");
        Vehicle car3 = new Car("Car-363");
        Vehicle bike1 = new Bike("Bike-477");
        Vehicle bike2 = new Bike("Bike-478");
        Vehicle bike3 = new Bike("Bike-479");


        Driver driver1 = new Driver("Alice", "alice@rideshare.com", l1, car1);
        Driver driver2 = new Driver("Charlie", "charlie@rideshare.com", l2, car2);
        Driver driver3 = new Driver("Bob", "bob@rideshare.com", l3, car3);
        Driver driver4 = new Driver("Saleh", "saleh@rideshare.com", l4, bike1);
        Driver driver5 = new Driver("Hasan", "hasan@rideshare.com", l5, bike2);
        Driver driver6 = new Driver("Faisul", "faisul@rideshare.com", l6, bike3);



//        Passenger passenger1 = new Passenger("John", "john@rideshare.com", l1);
//
//        RideMatchingSystem rideMatchingSystem = new RideMatchingSystem();
//        rideMatchingSystem.addDriver(driver1);
//        rideMatchingSystem.addDriver(driver2);

    }
}
