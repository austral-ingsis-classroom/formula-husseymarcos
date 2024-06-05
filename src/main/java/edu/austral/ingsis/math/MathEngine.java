package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Variable;
import edu.austral.ingsis.math.operation.*;
import edu.austral.ingsis.math.operation.Module;

import java.util.ArrayList;
import java.util.List;

public class MathEngine {

    Function function;

    List<String> variableSet = new ArrayList<>();

    public double evaluateFunction(){
        return function.evaluate();
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public String getFunctionString() {
        return function.getString();
    }

    public List<String>  collectVariablesRecursive(Function function) {

        if (function instanceof Variable) {
            variableSet.add(((Variable) function).getName());
        } else if (function instanceof Sum addition) {
            collectVariablesRecursive(addition.getFirstNum());
            collectVariablesRecursive(addition.getSecondNum());
        } else if (function instanceof Subtraction subtraction) {
            collectVariablesRecursive(subtraction.getFirstNum());
            collectVariablesRecursive(subtraction.getSecondNum());
        } else if (function instanceof Product multiplication) {
            collectVariablesRecursive(multiplication.getFirstNum());
            collectVariablesRecursive(multiplication.getSecondNum());
        } else if (function instanceof Power power) {
            collectVariablesRecursive(power.getExpression());
            collectVariablesRecursive(power.getPowerOf());
        } else if (function instanceof Parenthesis parenthesis) {
            collectVariablesRecursive(parenthesis.getFunction());
        } else if (function instanceof Root parenthesis) {
            collectVariablesRecursive(parenthesis.getExpression());
        } else if (function instanceof Module parenthesis) {
            collectVariablesRecursive(parenthesis.getExpression());
        } else if (function instanceof Division division) {
            Function firstNum = division.getFirstNum();
            Function secondNum = division.getSecondNum();
            collectVariablesRecursive(firstNum);
            collectVariablesRecursive(secondNum);
        }

        return variableSet;
    }
}
