package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Root implements Operation {

    private Expression expression;

    public Root(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate() {
        return (int) Math.sqrt(expression.evaluate());
    }

    @Override
    public List<Expression> getExpressions() {
        List<Expression> expressions = new ArrayList<>();
        expressions.add(expression);
        return expressions;
    }
}
