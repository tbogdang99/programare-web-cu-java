package ro.example.lab1.exercise4.notification.impl;

import ro.example.lab1.exercise4.notification.NotificationSender;

// TODO 1: Add @Component("emailSender").
public class EmailNotificationSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}