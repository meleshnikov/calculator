package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.calculator.service.CalculatorService;

import static pro.sky.calculator.view.Format.formatResult;
import static pro.sky.calculator.view.Operation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    @ResponseBody
    public String plus(@RequestParam(name = "num1") double num1,
                       @RequestParam(name = "num2") double num2) {
        return formatResult(
                num1,
                PLUS.operation(),
                num2,
                calculatorService.plus(num1, num2));
    }

    @GetMapping("/minus")
    @ResponseBody
    public String minus(@RequestParam(name = "num1") double num1,
                        @RequestParam(name = "num2") double num2) {
        return formatResult(
                num1,
                MINUS.operation(),
                num2,
                calculatorService.minus(num1, num2));
    }

    @GetMapping("/multiply")
    @ResponseBody
    public String multiply(@RequestParam(name = "num1") double num1,
                           @RequestParam(name = "num2") double num2) {
        return formatResult(
                num1,
                MULTIPLE.operation(),
                num2,
                calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    @ResponseBody
    public String divide(@RequestParam(name = "num1") double num1,
                         @RequestParam(name = "num2") double num2) {
        return formatResult(
                num1,
                DIVIDE.operation(),
                num2,
                calculatorService.divide(num1, num2));
    }

}
