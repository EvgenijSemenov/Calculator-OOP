package main.java.calculator.model;

import main.java.calculator.model.value.DoubleValue;
import main.java.calculator.model.value.Value;

public class Calculator {

    public Value evaluate(String expression) {
        return new Expression(expression).calculate();
    }

    public Value percentege(String expression, Value persent) {
        return new Expression(expression).percentage(persent);
    }

    public Value root(Value value, Value rootPower) {
        return value.root(rootPower);
    }

    public Value power(Value value, Value power) {
        return value.power(power);
    }

    public Value divideUnit(Value value) {
        return new DoubleValue(1.0).divide(value);
    }

}
