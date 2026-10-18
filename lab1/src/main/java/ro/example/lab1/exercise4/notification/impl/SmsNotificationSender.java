package ro.example.lab1.exercise4.notification.impl;

import ro.example.lab1.exercise4.notification.NotificationSender;

// TODO 2: Add @Component("smsSender").
public class SmsNotificationSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}