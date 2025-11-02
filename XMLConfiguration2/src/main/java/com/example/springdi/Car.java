package com.example.springdi;

public class Car {
    private Engine engine;
    private String color;

    public Car() {
        System.out.println("Car object created (default constructor).");
    }

    // Setter for Engine
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Setter for Color
    public void setColor(String color) {
        this.color = color;
    }

    public void drive() {
        engine.start();
        System.out.println("Car (color: " + color + ") is driving...");
    }
}
