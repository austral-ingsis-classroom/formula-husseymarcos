package edu.austral.ingsis.math;


import edu.austral.ingsis.math.operation.Operation;

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
