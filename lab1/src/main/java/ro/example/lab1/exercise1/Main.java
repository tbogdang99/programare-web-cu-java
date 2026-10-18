import ro.example.lab1.exercise1.service.NotificationService;

public class Main {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();
        service.notifyUser("Hello students!");

        // TODO 2: Create the sender in Main
        // and inject it through the constructor.

        // TODO 3: Create SmsNotificationSender
        // and switch from Email to SMS.
    }
}