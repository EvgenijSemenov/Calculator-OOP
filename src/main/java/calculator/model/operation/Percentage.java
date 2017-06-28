package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Percentage implements Operation {

    @Override
    public Value execute(Value firstValue, Value secondValue) {
        return firstValue.percentage(secondValue);
    }

}
