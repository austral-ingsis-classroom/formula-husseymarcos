package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;


public class Subtraction implements Function {

    public Function getFirstNum() {
        return firstNum;
    }

    public Function getSecondNum() {
        return secondNum;
    }

    final Function firstNum;

    private Function secondNum;

    public Subtraction(Function firstNum, Function secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public int evaluate() {
        return firstNum.evaluate() - secondNum.evaluate();
    }

    @Override
    public String getString() {
        return firstNum.getString() + " - " + secondNum.getString();
    }

}
