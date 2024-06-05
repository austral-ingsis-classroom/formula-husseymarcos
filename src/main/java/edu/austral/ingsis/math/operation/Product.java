package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;


public class Product implements Function {

    public Function getFirstNum() {
        return firstNum;
    }

    public Function getSecondNum() {
        return secondNum;
    }

    private final Function firstNum;

    private final Function secondNum;

    public Product(Function firstNum, Function secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public Double evaluate() {
        return firstNum.evaluate() * secondNum.evaluate();
    }

    @Override
    public String getString() {
        return firstNum.getString() + " * " + secondNum.getString();
    }

}
