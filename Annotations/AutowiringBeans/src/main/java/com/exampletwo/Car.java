package com.exampletwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired   // Spring automatically injects Engine bean
    private Engine engine;

    public void start() {
        engine.start();
        System.out.println("Car is running smoothly!");
    }
}

