package pro.sky.calculator.exceptions;

public class DivisionByZeroException extends IllegalArgumentException {

    public DivisionByZeroException() {
    }

    public DivisionByZeroException(String s) {
        super(s);
    }
}
