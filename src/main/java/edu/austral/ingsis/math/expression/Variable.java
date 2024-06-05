package edu.austral.ingsis.math.expression;

import edu.austral.ingsis.math.Function;


public class Variable implements Function {

    private final String name;

    private final int value;

    public Variable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }


    public int getValue() {
        return value;
    }

    @Override
    public int evaluate() {
        return getValue();
    }

    @Override
    public String getString() {
        return getName();
    }


}
