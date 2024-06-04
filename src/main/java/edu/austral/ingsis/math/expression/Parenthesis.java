package edu.austral.ingsis.math.expression;

import edu.austral.ingsis.math.operation.Operation;

public class Parenthesis implements Expression{


    Operation operation;

    public Parenthesis(Operation expression) {
        this.operation = expression;
    }


    @Override
    public int evaluate() {
        return operation.evaluate();
    }

    @Override
    public String toString() {
        return "( " + operation.toString() + " )";
    }

    @Override
    public String getName() {
        return "";
    }


}
