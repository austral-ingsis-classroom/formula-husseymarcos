package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Expression;
import edu.austral.ingsis.math.expression.Variable;

import java.util.List;

public class Function {

    List<Expression> expressions;

    List<String> variables;

    public Function(List<Expression> expressions, List<String> variables) {
        this.expressions = expressions;
        this.variables = variables;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public List<String> getVariables() {
        return variables;
    }

}
