package com.example;

import org.springframework.stereotype.Component;

@Component("diselEngine")
public class DiselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("🚙 Diesel Engine started... strong and powerful!");
    }
}
