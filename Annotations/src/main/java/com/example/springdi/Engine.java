package com.example.springdi;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private final String model = "V8-2025";
    private final int horsepower = 400;

    // no-arg constructor (optional logging)
    public Engine() {
        System.out.println("Engine bean created");
    }

    public void start() {
        System.out.println("Engine " + model + " with " + horsepower + " HP starting...");
    }

    // getters if needed
    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
