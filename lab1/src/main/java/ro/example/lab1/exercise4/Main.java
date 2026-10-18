package ro.example.lab1.exercise4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.example.lab1.exercise4.config.AppConfig;

public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            // TODO 7: Retrieve NotificationService from Spring.
            // TODO 8: Send "Hello students!".
        }
    }
}