package edu.austral.ingsis.math.expression;

import edu.austral.ingsis.math.Function;

public class Constant implements Function {

  private final int value;

  public Constant(int value) {
    this.value = value;
  }

  @Override
  public Double evaluate() {
    return (double) value;
  }

  @Override
  public String getString() {
    return String.valueOf(value);
  }
}
