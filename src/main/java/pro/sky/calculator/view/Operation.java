package pro.sky.calculator.view;

public enum Operation {

    PLUS("+"),
    MINUS("-"),
    MULTIPLE("*"),
    DIVIDE("/");

    private final String operation;

    public String operation() {
        return operation;
    }

    Operation(String operation) {
        this.operation = operation;
    }
}
