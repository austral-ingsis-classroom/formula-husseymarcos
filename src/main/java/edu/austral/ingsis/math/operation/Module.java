package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Module implements Operation {

    private final Expression expression;

    public Module(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate() {
        return Math.abs(expression.evaluate());
    }

    @Override
    public List<Expression> getExpressions() {
        List<Expression> expressions = new ArrayList<>();
        expressions.add(expression);
        return expressions;
    }
}
