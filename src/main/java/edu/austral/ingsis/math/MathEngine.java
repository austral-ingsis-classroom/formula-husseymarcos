package edu.austral.ingsis.math;

import java.util.List;

public class MathEngine {

    Function function;

    public double evaluateFunction(){

        if (function != null) {
            double result = 0;

            List<Expression> expressionList = function.getExpressions();

            for (Expression expression : expressionList) {
                result += expression.evaluate();
            }

            return result;
        }

        throw new RuntimeException("No Function defined");
    }

    public void addFunction(Function function) {
        this.function = function;
    }

    public void printFunction(){
        StringBuilder finalString = new StringBuilder();

        List<Expression> functionExpressions = function.getExpressions();
        for (Expression expression : functionExpressions) {
            finalString.append(expression.toString());
        }

        System.out.println(finalString);
    }
}
