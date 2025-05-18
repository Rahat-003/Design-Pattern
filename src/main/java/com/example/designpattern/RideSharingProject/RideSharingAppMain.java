package com.example.designpattern.RideSharingProject;


import com.example.designpattern.RideSharingProject.BadCodeExample.BadCodeMain;

/**
 * <h1>RideSharingApplication Design Specification</h1>
 *
 * <p>
 * You are tasked with designing and implementing a ride-sharing application
 * where passengers can request rides, and drivers can be matched to them
 * based on proximity. The system should handle different types of vehicles
 * (e.g., cars, bikes, luxury cars) and support multiple fare calculation
 * strategies. It must notify both passengers and drivers about ride statuses
 * and calculate the fare based on the ride type and distance traveled.
 * </p>
 *
 * <h2>Objective</h2>
 * <p>
 * Design a clean, maintainable, and scalable system using SOLID principles and
 * appropriate design patterns. Ensure adherence to good software design practices.
 * </p>
 *
 * <h2>Constraints</h2>
 * <ul>
 *     <li>
 *         The ride-matching algorithm must assign the nearest driver based on
 *         the distance between the passenger and driver.
 *     </li>
 *     <li>
 *         At least three fare calculation strategies must be implemented:
 *         <b>Standard</b>, <b>Shared</b>, and <b>Luxury</b>.
 *     </li>
 *     <li>
 *         The system should support different vehicle types:
 *         <b>Car</b> and <b>Bike</b>, with extensibility for future vehicle types.
 *     </li>
 *     <li>
 *         Notifications must be sent to both the passenger and driver as the ride
 *         progresses through different statuses: <b>pending</b>, <b>ongoing</b>, and <b>completed</b>.
 *     </li>
 * </ul>
 *
 * <h2>Design Considerations</h2>
 * <ul>
 *     <li>Use of Strategy Pattern for fare calculation</li>
 *     <li>Observer Pattern for ride status notifications</li>
 *     <li>Factory Pattern for vehicle creation</li>
 *     <li>Adherence to SOLID principles</li>
 * </ul>
 */

public class RideSharingAppMain {


    public static void main(String[] args) {
        BadCodeMain.main(args);
    }

}
