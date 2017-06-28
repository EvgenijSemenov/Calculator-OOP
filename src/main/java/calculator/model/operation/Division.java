package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Division extends Operation {

    public Division() {
        priority = MEDIUM;
    }

    @Override
    public Value execute(Value value1, Value value2) {
        return value1.divide(value2);
    }

}
