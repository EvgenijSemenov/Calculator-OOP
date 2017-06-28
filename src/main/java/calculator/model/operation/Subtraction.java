package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Subtraction extends Operation {

    public Subtraction() {
        priority = LOW;
    }

    @Override
    public Value execute(Value value1, Value value2) {
        return value1.substract(value2);
    }

}