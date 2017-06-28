package main.java.calculator.view.button.action;

import main.java.calculator.model.Calculator;
import main.java.calculator.view.DisplayPanel;

import java.awt.event.ActionEvent;

public class CalculateResultActionListener extends CalculatorActionListener {

    public CalculateResultActionListener(DisplayPanel displayPanel) {
        super(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String expression = displayPanel.getExpression() + " " + displayPanel.getResult();
        String calculateResult = new Calculator().evaluate(expression).toString();
        displayPanel.clearExpression();
        displayPanel.setResult(calculateResult);
    }

}
