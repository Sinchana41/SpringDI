package com.example;

public class Car {
    private Engine engine;

    // Setter (used by autowire="byType")
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car is running smoothly!");
    }
}
