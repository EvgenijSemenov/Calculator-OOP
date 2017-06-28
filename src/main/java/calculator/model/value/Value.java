package main.java.calculator.model.value;

public interface Value {

    Value add(Value value);
    Value multiply(Value value);
    Value substract(Value value);
    Value divide(Value value);
    Value percentage(Value value1);
    Value root(Value value);
    Value power(Value value);
    String toString();
    
}
