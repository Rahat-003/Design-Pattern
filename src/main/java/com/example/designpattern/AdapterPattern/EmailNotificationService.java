package com.example.designpattern.AdapterPattern;

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Sending email to \u001B[36m" + to + "\u001B[0m");
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

}
