package edu.austral.ingsis.math;

public class Number implements Expression{

    private final Double value;

    public Number(Double value) {
        this.value = value;
    }

    @Override
    public Double evaluate() {
        return value;
    }

    @Override
    public void printExpression() {
        System.out.println(value);
    }
}
