package ro.example.lab2.exercise2.service;

import org.springframework.stereotype.Service;

@Service
// TODO 1: Adaugati @Lazy pentru a amana initializarea bean-ului
public class RecommendationEngine {

    public RecommendationEngine() {
        System.out.println("RecommendationEngine initialized!");
    }

    public void recommend() {
        System.out.println("Recommended product: Laptop");
    }
}