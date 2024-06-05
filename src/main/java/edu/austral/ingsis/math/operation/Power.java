package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;

public class Power implements Function {

  private final Function expression;

  private final Function powerOf;

  public Function getExpression() {
    return expression;
  }

  public Function getPowerOf() {
    return powerOf;
  }

  public Power(Function expression, Function powerOf) {
    this.expression = expression;
    this.powerOf = powerOf;
  }

  @Override
  public Double evaluate() {
    return Math.pow(expression.evaluate(), powerOf.evaluate());
  }

  @Override
  public String getString() {
    return expression.getString() + " ^ " + powerOf.getString();
  }
}
