package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired   //  Field-based Dependency Injection
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println(" Car is driving smoothly...");
    }
}
