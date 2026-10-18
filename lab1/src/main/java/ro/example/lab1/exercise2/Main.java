package ro.example.lab1.exercise2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.example.lab1.exercise2.config.AppConfig;

public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            // TODO 4: Retrieve a BankAccount bean by type.
            // TODO 5: Display the account information.
            // TODO 6: Retrieve savingsAccount by name.
        }
    }
}