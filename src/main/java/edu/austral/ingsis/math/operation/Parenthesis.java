package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;

public class Parenthesis implements Function {

    Function function;

    public Parenthesis(Function function) {
        this.function = function;
    }


    @Override
    public int evaluate() {
        return function.evaluate();
    }

    @Override
    public String getString() {
        return "(" + function.getString() + ")";
    }
}
