package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Power implements Operation {

    @Override
    public Value execute(Value firstValue, Value secondValue) {
        return firstValue.power(secondValue);
    }

}
