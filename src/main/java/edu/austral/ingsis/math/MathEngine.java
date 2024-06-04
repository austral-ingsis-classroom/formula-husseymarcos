package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Expression;
import edu.austral.ingsis.math.expression.Parenthesis;
import edu.austral.ingsis.math.expression.Variable;
import edu.austral.ingsis.math.operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class MathEngine {

    Function function;

    public double evaluateFunction(){

        if (function != null) {
            double result = 0;

            List<Operation> expressionList = function.getOperations();

            for (Operation operation : expressionList) {
                result += operation.evaluate();
            }

            return result;
        }

        throw new RuntimeException("No Function defined");
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public String printFunction(){
        StringBuilder finalString = new StringBuilder();
        List<Operation> functionExpressions = function.getOperations();

        for (Operation operation : functionExpressions) {
            String expressionString = operation.toString();
            finalString.append(expressionString);
        }

        return finalString.toString();
    }

    public List<String> getVariablesFromFunction(){
        List<String> variables = new ArrayList<>();
        List<Operation> operations = function.getOperations();
        for (Operation operation: operations) {
            List<Expression> expressions = operation.getExpressions();
            for (Expression expression: expressions)
                if (expression instanceof Variable || expression instanceof Parenthesis) {
                    String name = expression.getName();
                    variables.add(name);
            }
        }
        return variables;
    }
}
