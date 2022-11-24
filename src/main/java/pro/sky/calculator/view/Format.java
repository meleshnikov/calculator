package pro.sky.calculator.view;

public class Format {

    private static final String TEMPLATE = "%.1f %s %.1f = %.1f";

    public static String formatResult(double num1, String op, double num2, double result) {
        return String.format(TEMPLATE, num1, op, num2, result);
    }

}
