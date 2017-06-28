package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Subtraction implements Operation {

    @Override
    public Value execute(Value firstValue, Value secondValue) {
        return firstValue.substract(secondValue);
    }

}
