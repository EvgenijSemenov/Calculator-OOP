package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public interface Operation {

    Value execute(Value value1, Value value2);

}
