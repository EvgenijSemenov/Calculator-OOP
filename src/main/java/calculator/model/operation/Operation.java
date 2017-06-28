package main.java.calculator.model.operation;

import main.java.calculator.model.value.Value;

public abstract class Operation {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;

    public int priority;

    abstract public Value execute(Value value1, Value value2);
}
