package ro.example.lab1.exercise4.service;

import ro.example.lab1.exercise4.notification.NotificationSender;

// TODO 3: Add @Service.
public class NotificationService {

    private final NotificationSender sender;

    // TODO 4: Let Spring inject the dependency.
    // TODO 5: Use @Qualifier to choose emailSender.

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String message) {
        sender.send(message);
    }
}