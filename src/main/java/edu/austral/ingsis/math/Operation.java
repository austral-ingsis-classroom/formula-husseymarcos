package edu.austral.ingsis.math;


import edu.austral.ingsis.math.expression.Expression;

import java.util.List;

public interface Operation {
    int evaluate();
    List<Expression> getExpressions();
}
