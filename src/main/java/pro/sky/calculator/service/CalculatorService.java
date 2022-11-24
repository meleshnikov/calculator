package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exceptions.DivisionByZeroException;

@Service
public class CalculatorService {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Division by zero!");
        }
        return num1 / num2;
    }

}
