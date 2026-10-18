package ro.example.lab1.exercise3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.example.lab1.exercise3.config.AppConfig;

public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            // TODO 3: Retrieve GreetingService from Spring.
            // TODO 4: Print greet("students").
        }
    }
}