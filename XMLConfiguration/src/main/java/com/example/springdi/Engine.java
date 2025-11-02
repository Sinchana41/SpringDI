package com.example.springdi;

public class Engine {
    private final String model;
    private final int horsepower;

    // Constructor
    public Engine(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine " + model + " with " + horsepower + " HP starting...");
    }

    // getters (optional)
    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
