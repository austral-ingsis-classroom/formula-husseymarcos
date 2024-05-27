package edu.austral.ingsis.math.expression;

public class Sum implements Expression {

    private final int firstNum;

    private final int secondNum;

    public Sum(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public int evaluate() {
        return firstNum + secondNum;
    }

    @Override
    public String toString() {
        return firstNum + " + " + secondNum;
    }
}
