package main.java.calculator.model;

import main.java.calculator.model.operation.*;
import main.java.calculator.model.value.DoubleValue;
import main.java.calculator.model.value.Value;

import java.util.LinkedList;

public class Expression {

    private LinkedList<Value> values = new LinkedList<Value>();
    private LinkedList<Operation> operations = new LinkedList<Operation>();

    public Expression(String expression) {
        String[] tokens = tokenize(expression);
        for (String token : tokens) {
            if (isOperation(token)) {
                operations.add(operationByToken(token));
            } else {
                values.add(new DoubleValue(token));
            }
        }
    }

    public Value calculate() {
        if (values.size() > 1) {
            for (Operation operation : operations) {
                Value firstValue = values.get(0);
                Value secondValue = values.get(1);

                Value result = operation.execute(firstValue, secondValue);
                values.remove(firstValue);
                values.remove(secondValue);
                values.addFirst(result);
            }
        }

        return values.getFirst();
    }

    public Value percentage(Value percent) {
        return new DoubleValue(calculate().toString()).percentage(percent);
    }

    private boolean isOperation(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private String[] tokenize(String expression) {
        //expression = insertBlanks(expression);

        return expression.split("\\s+");
    }

    private static String insertBlanks(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (c == '(' || c == ')' || c == '+' || c == '-' || c == '*' || c == '/') {
                result.append(' ').append(c).append(' ');
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private Operation operationByToken(String token) {
        Operation operation = null;
        switch (token) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
        }

        return operation;
    }

}
