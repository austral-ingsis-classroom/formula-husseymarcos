package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;


public class Module implements Function {

    public Function getExpression() {
        return expression;
    }

    private final Function expression;

    public Module(Function expression) {
        this.expression = expression;
    }

    @Override
    public Double evaluate() {
        return Math.abs(expression.evaluate());
    }

    @Override
    public String getString() {
        return "|" + expression.getString() + "|";
    }


}
