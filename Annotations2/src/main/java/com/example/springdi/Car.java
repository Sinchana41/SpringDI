package com.example.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine; // dependency
    private String color = "Red";

    public Car() {
        System.out.println("Car bean created");
    }

    // Setter method with @Autowired
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine injected via setter");
    }

    public void drive() {
        engine.start();
        System.out.println("Car (color: " + color + ") is driving...");
    }
}
