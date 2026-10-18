
package ro.example.lab2.exercise1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.example.lab2.exercise1.config.AppConfig;
import ro.example.lab2.exercise1.model.ShoppingCart;
import ro.example.lab2.exercise1.service.CartManager;

public class Main {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println("=== Bean Scopes ===");

            ShoppingCart cart1 = context.getBean(ShoppingCart.class);
            ShoppingCart cart2 = context.getBean(ShoppingCart.class);

            System.out.println("Cart 1: " + cart1.getId());
            System.out.println("Cart 2: " + cart2.getId());
            System.out.println("Same instance? " + (cart1 == cart2));

            System.out.println("\n=== Cart Manager ===");

            CartManager manager = context.getBean(CartManager.class);

            System.out.println("Injected cart 1: "
                    + manager.getInjectedCart().getId());
            System.out.println("Injected cart 2: "
                    + manager.getInjectedCart().getId());

            System.out.println("\n=== ObjectProvider ===");

            System.out.println("Created cart 1: "
                    + manager.createCart().getId());
            System.out.println("Created cart 2: "
                    + manager.createCart().getId());
        }
    }
}
