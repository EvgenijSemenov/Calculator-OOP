package main.java.calculator.view.button.action;

import main.java.calculator.model.Calculator;
import main.java.calculator.model.value.DoubleValue;
import main.java.calculator.model.value.Value;
import main.java.calculator.view.DisplayPanel;

import java.awt.event.ActionEvent;

public class PercentageActionListener extends CalculatorActionListener {

    public PercentageActionListener(DisplayPanel displayPanel) {
        super(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String expression = displayPanel.getExpression();
        expression = expression.substring(0, expression.length());

        Value percent = new DoubleValue(displayPanel.getResult());
        Value result = new Calculator().percentege(expression, percent);

        displayPanel.setResult(result.toString());
    }

}
