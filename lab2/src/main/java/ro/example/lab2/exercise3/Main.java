
package ro.example.lab2.exercise3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.example.lab2.exercise3.config.AppConfig;
import ro.example.lab2.exercise3.service.OrderService;

public class Main {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            OrderService orderService =
                    context.getBean(OrderService.class);

            System.out.println("=== Successful Order ===");
            String result = orderService.placeOrder("Laptop", 2);
            System.out.println(result);

            System.out.println("\n=== Invalid Order ===");

            try {
                orderService.placeOrder("Mouse", -1);
            } catch (IllegalArgumentException ex) {
                System.out.println("Error caught in Main: "
                        + ex.getMessage());
            }
        }
    }
}
