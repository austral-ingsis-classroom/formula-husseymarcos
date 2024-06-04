package edu.austral.ingsis.math.expression;

import edu.austral.ingsis.math.Operation;

import java.util.ArrayList;
import java.util.List;

public class Division implements Operation {

    private final Expression firstNum;

    private final Expression secondNum;

    public Division(Expression firstNum, Expression secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public int evaluate() {
        return firstNum.evaluate() / secondNum.evaluate();
    }

    @Override
    public List<Expression> getExpressions() {
        List<Expression> expressions = new ArrayList<>();
        expressions.add(firstNum);
        expressions.add(secondNum);
        return expressions;
    }

    @Override
    public String toString() {
        return firstNum + "/" + secondNum;
    }
}
