package com.example.designpattern.AdapterPattern.With;

import com.example.designpattern.AdapterPattern.NotificationService;
import com.example.designpattern.AdapterPattern.SendGridService;

public class SendGridAdapter implements NotificationService {

    private SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        // Adapter Method => Convert parameters and calls to SendGrid Method
        sendGridService.sendEmail(to, subject, body);

    }
}
