package edu.austral.ingsis.math.expression;

public class Number implements Expression {

    private final int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
