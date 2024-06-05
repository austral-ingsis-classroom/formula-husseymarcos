package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;

public class Power implements Function {

    public Function getExpression() {
        return expression;
    }

    public Function getPowerOf() {
        return powerOf;
    }

    private final Function expression;

    private final Function powerOf;

    public Power(Function expression, Function powerOf) {
        this.expression = expression;
        this.powerOf = powerOf;
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), powerOf.evaluate());
    }

    @Override
    public String getString() {
        return "";
    }

}
