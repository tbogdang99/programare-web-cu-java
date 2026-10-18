
package ro.example.lab2.exercise3.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String placeOrder(String product, int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero!"
            );
        }

        System.out.println("Processing order: "
                + product + " x " + quantity);

        return "Order placed successfully!";
    }
}
