package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public class Addition extends Operation {

    public Addition() {
        priority = LOW;
    }

    @Override
    public Value execute(Value value1, Value value2) {
        return value1.add(value2);
    }

}
