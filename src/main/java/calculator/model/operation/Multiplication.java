package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Multiplication implements Operation {

    @Override
    public Value execute(Value value1, Value value2) {
        return value1.multiply(value2);
    }

}
