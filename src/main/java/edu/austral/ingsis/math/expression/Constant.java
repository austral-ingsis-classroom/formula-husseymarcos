package edu.austral.ingsis.math.expression;

public class Constant implements Expression {

    private final int value;

    public Constant(int value) {
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
