package com.example.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;
    private final String color = "Red";

    // Constructor-based injection    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car bean created");
    }

    public void drive() {
        engine.start();
        System.out.println("Car (color: " + color + ") is driving...");
    }

    // getter if needed
    public Engine getEngine() {
        return engine;
    }
}
