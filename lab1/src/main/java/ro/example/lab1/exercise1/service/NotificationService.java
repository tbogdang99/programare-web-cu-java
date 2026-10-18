package ro.example.lab1.exercise1.service;

import ro.example.lab1.exercise1.notification.impl.EmailNotificationSender;

public class NotificationService {

    private final EmailNotificationSender sender =
            new EmailNotificationSender();

    // TODO 1: Replace tight coupling with constructor injection.
    // Depend on NotificationSender instead of EmailNotificationSender.

    public void notifyUser(String message) {
        sender.send(message);
    }
}