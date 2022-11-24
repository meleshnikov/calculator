package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exceptions.DivisionByZeroException;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void twoPlusTwoShouldBeFour() {
        Assertions.assertEquals(4, calculatorService.plus(2, 2));
    }

    @Test
    public void minusTenPlusTenShouldBeZero() {
        Assertions.assertEquals(0, calculatorService.plus(-10, 10));
    }

    @Test
    public void twoMinusTwoShouldBeZero() {
        Assertions.assertEquals(0, calculatorService.minus(2, 2));
    }

    @Test
    public void sevenMinusTwoShouldBeFive() {
        Assertions.assertEquals(5, calculatorService.minus(7, 2));
    }

    @Test
    public void twoMultiplyThreeShouldBeSix() {
        Assertions.assertEquals(6, calculatorService.multiply(2, 3));
    }

    @Test
    public void zeroMultiplyTwoShouldBeZero() {
        Assertions.assertEquals(0, calculatorService.multiply(0, 2));
    }

    @Test
    public void fourDivideTwoShouldBeTwo() {
        Assertions.assertEquals(2, calculatorService.divide(4, 2));
    }

    @Test
    public void sixDivideTwoShouldBeThree() {
        Assertions.assertEquals(3, calculatorService.divide(6, 2));
    }

    @Test
    public void shouldThrowDivisionByZeroException() {
        Assertions.assertThrows(DivisionByZeroException.class,
                () -> calculatorService.divide(5, 0));
    }

}
