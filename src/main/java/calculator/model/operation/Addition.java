package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Addition implements Operation {

    @Override
    public Value execute(Value firstValue, Value secondValue) {
        return firstValue.add(secondValue);
    }

}
