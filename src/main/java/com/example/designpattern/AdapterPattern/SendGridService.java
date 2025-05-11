package com.example.designpattern.AdapterPattern;

public class SendGridService {
    public void sendEmail(String recipient, String title, String body) {
        System.out.println("Sending Email via SendGrid Service to \u001B[36m" + recipient + "\u001B[0m");
        System.out.println("Title: \u001B[36m" + title + "\u001B[0m");
        System.out.println("Body: \u001B[36m" + body + "\u001B[0m");
    }

}
