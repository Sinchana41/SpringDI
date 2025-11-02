package com.example.springdi;

public class Car {
    private final Engine engine;
    private final String color;

    // Constructor-based injection
    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public void drive() {
        engine.start();
        System.out.println("Car (color: " + color + ") is driving...");
    }

    // getters (optional)
    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }
}
