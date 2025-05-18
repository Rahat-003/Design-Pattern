package com.example.designpattern.FacadePattern;


// Microservice for User Management
public class UserService {

    public String getUserDetails(String userId) {
        // fetching user details
        return "User details for userId: " + userId;
    }
}
