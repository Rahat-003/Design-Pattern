package com.example.designpattern.AdapterPattern.Without;

public class SendGridService {
    public void sendEmail(String recipient, String title, String body) {
        System.out.println("Sending Email via SendGrid Service to" + recipient);
        System.out.println("Title: " + title);
        System.out.println("Body: " + body);

    }
}
