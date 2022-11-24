package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorServiceParamTest {

    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> provideParamsForPlusTests() {
        return Stream.of(
                Arguments.of(2, 5, 7),
                Arguments.of(4, 1, 5),
                Arguments.of(-100, 50, -50),
                Arguments.of(10, 2, 12)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of(2, 5, -3),
                Arguments.of(4, 1, 3),
                Arguments.of(-100, 50, -150),
                Arguments.of(10, 2, 8)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(2, 5, 10),
                Arguments.of(4, 1, 4),
                Arguments.of(-100, 50, -5000),
                Arguments.of(10, 2, 20)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(2, 5, 0.4),
                Arguments.of(4, 1, 4),
                Arguments.of(-100, 50, -2),
                Arguments.of(10, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTests")
    public void plusTest(double num1, double num2, double result) {
        Assertions.assertEquals(result, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void minusTest(double num1, double num2, double result) {
        Assertions.assertEquals(result, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void multipleTest(double num1, double num2, double result) {
        Assertions.assertEquals(result, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void divideTest(double num1, double num2, double result) {
        Assertions.assertEquals(result, calculatorService.divide(num1, num2));
    }

}