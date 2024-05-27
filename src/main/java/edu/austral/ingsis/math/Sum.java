package edu.austral.ingsis.math;

public class Sum implements Expression{

    private final Double firstNum;

    private final Double secondNum;

    public Sum(Double firstNum, Double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public Double evaluate() {
        return firstNum + secondNum;
    }

    @Override
    public String toString() {
        return firstNum + " + " + secondNum;
    }
}
