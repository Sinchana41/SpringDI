package com.example.springdi;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private final String model = "V8-2025";
    private final int horsepower = 400;

    public Engine() {
        System.out.println("Engine bean created");
    }

    public void start() {
        System.out.println("Engine " + model + " with " + horsepower + " HP starting...");
    }
}
