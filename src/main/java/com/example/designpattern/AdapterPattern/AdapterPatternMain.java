package com.example.designpattern.AdapterPattern;

import com.example.designpattern.AdapterPattern.With.WithAdapterPattern;
import com.example.designpattern.AdapterPattern.Without.WithoutAdapterPattern;



/**
 * <h2>🧩 Problem Statement - Adapter Pattern</h2>
 *
 * <p>
 * Consider an <strong>e-commerce application</strong> that is required to send
 * <strong>email notifications</strong> to customers. The system currently utilizes
 * an internal service named <code>EmailNotificationService</code> for sending emails.
 * </p>
 *
 * <p>
 * However, the business now intends to integrate a third-party email provider such as
 * <strong>SendGrid</strong>. The challenge is that the interface provided by
 * <code>EmailNotificationService</code> is not compatible with the SendGrid API.
 * </p>
 *
 * <p>
 * Therefore, the objective is to enable the existing codebase to work with SendGrid
 * without modifying the core business logic or the current interface used throughout the application.
 * </p>
 *
 * <p>
 * The <strong>Adapter Pattern</strong> can be applied to solve this problem. It allows
 * the new SendGrid service to be wrapped in an adapter that conforms to the expected
 * <code>EmailNotificationService</code> interface, thus enabling seamless integration
 * without impacting existing code.
 * </p>
 *
 * <p><em>In essence, the Adapter Pattern bridges the gap between incompatible interfaces.</em></p>
 */

public class AdapterPatternMain {
    public static void main(String[] args) {
//        WithoutAdapterPattern.main(args);
        WithAdapterPattern.main(args);
    }
}
