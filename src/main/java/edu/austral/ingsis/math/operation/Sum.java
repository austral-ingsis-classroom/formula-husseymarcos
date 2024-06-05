package edu.austral.ingsis.math.operation;

import edu.austral.ingsis.math.Function;

public class Sum implements Function {

    public Function getFirstNum() {
        return firstNum;
    }

    public Function getSecondNum() {
        return secondNum;
    }

    private final Function firstNum;

    private final Function secondNum;

    public Sum(Function firstNum, Function secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public int evaluate() {
        return firstNum.evaluate() + secondNum.evaluate();
    }

    @Override
    public String getString() {
        return firstNum + "+" + secondNum;
    }

}
