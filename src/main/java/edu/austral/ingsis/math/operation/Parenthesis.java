package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;

public class Parenthesis implements Function {

    public Function getFunction() {
        return function;
    }

    Function function;

    public Parenthesis(Function function) {
        this.function = function;
    }


    @Override
    public Double evaluate() {
        return function.evaluate();
    }

    @Override
    public String getString() {
        return "(" + function.getString() + ")";
    }
}
