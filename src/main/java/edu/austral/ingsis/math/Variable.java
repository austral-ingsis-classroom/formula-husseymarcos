package edu.austral.ingsis.math;

public class Variable implements Expression{

    private String name;

    private Double value;

    public Variable(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public void printName(){
        System.out.println(getName());
    }

    @Override
    public Double evaluate() {
        return getValue();
    }

    @Override
    public void printExpression() {
        System.out.println(getName());
    }
}
