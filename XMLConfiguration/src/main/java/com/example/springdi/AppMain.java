package com.example.springdi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        // Load Spring XML configuration from classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the car bean
        Car car = (Car) context.getBean("car");
        car.drive();

    }
}
