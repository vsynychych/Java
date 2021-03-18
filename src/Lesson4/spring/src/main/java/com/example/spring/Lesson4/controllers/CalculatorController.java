package com.example.spring.Lesson4.controllers;

import com.example.spring.Lesson4.dao.CalculatorDao;
import com.example.spring.Lesson4.models.Calculator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CalculatorController {
    CalculatorDao calculatorDao;

    @GetMapping("/calculator")
    public Object calc(@RequestParam Integer a, Integer b, String action) {
        Calculator calculator = new Calculator(a, b, action);
        if (calculator.getAction().equals("add")) {
            return (calculator.getA() + " + " + calculator.getB() + " = " + (double) (calculator.getA() + calculator.getB()));
        } else if (calculator.getAction().equals("sub")) {
            return (calculator.getA() + " - " + calculator.getB() + " = " + (double) (calculator.getA() - calculator.getB()));
        } else if (calculator.getAction().equals("div")) {
            return (calculator.getA() + " : " + calculator.getB() + " = " + ((float) calculator.getA() / (float) calculator.getB()));
        } else if (calculator.getAction().equals("multi")) {
            return (calculator.getA() + " * " + calculator.getB() + " = " + (double) (calculator.getA() * calculator.getB()));
        } else {
            return ("Wrong!!!!!!!!!");
        }
    }
}
