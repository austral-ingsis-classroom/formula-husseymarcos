package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;


public class Root implements Function {

    public Function getExpression() {
        return expression;
    }

    private final Function expression;

    public Root(Function expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate() {
        return (int) Math.sqrt(expression.evaluate());
    }

    @Override
    public String getString() {
        return "";
    }

}
