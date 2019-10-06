package com.spring.basic.start.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
        }
    }
}
