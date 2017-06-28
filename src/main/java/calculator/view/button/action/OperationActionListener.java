package main.java.calculator.view.button.action;

import main.java.calculator.model.Calculator;
import main.java.calculator.view.DisplayPanel;

import java.awt.event.ActionEvent;

public class OperationActionListener extends CalculatorActionListener {

    public OperationActionListener(DisplayPanel displayPanel) {
        super(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String expression = displayPanel.getExpression();
        expression += " " + displayPanel.getResult() + " " + e.getActionCommand();
        expression = expression.trim();

        //TODO fix using setExpression method twice
        displayPanel.setExpression(expression);

        if (expression.length() > 3) {
            String expressionResult = new Calculator().evaluate(expression.substring(0, expression.length() - 2)).toString();
            displayPanel.updateResult(expressionResult);
        }

        displayPanel.setExpression(expression);
    }

}
