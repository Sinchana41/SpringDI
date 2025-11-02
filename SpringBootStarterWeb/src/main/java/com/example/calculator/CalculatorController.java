package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(
            @RequestParam String operation,
            @RequestParam double num1,
            @RequestParam double num2) {

        double result;

        switch (operation.toLowerCase()) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) {
                    return " Cannot divide by zero!";
                }
                result = num1 / num2;
                break;
            default:
                return "Invalid operation! Use add, subtract, multiply, or divide.";
        }

        return " Result: " + result;
    }
}
