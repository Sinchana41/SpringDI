package com.example.springdi;

public class Engine {
    private String model;
    private int horsePower;

    public Engine() {
        System.out.println("Engine object created (default constructor).");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getDetails() {
        return model + " with " + horsePower + " HP";
    }

    public void start() {
        System.out.println("Engine " + getDetails() + " is starting...");
    }
}
