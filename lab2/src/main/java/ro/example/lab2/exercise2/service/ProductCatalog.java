package ro.example.lab2.exercise2.service;

import org.springframework.stereotype.Service;

@Service
public class ProductCatalog {

    public ProductCatalog() {
        System.out.println("ProductCatalog initialized!");
    }

    public void showProducts() {
        System.out.println("Available products: Laptop, Mouse, Keyboard");
    }
}