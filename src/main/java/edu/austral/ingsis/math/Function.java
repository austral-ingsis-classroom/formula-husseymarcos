package edu.austral.ingsis.math;


import java.util.List;

public class Function {

    List<Operation> operations;

    public Function(List<Operation> expressions) {
        this.operations = expressions;
    }

    public List<Operation> getOperations() {
        return operations;
    }

}
