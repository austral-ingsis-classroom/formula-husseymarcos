package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Power implements Operation {

    private Expression expression;

    private Expression powerOf;

    public Power(Expression expression, Expression powerOf) {
        this.expression = expression;
        this.powerOf = powerOf;
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), powerOf.evaluate());
    }

    @Override
    public List<Expression> getExpressions() {
        List<Expression> expressions = new ArrayList<>();
        expressions.add(expression);
        expressions.add(powerOf);
        return expressions;
    }
}
