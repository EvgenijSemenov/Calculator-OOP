package main.java.calculator.view.button.action;

import main.java.calculator.model.Calculator;
import main.java.calculator.model.value.DoubleValue;
import main.java.calculator.model.value.Value;
import main.java.calculator.view.DisplayPanel;

import java.awt.event.ActionEvent;

public class RootActionListener extends CalculatorActionListener {

    public RootActionListener(DisplayPanel displayPanel) {
        super(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Value value = new DoubleValue(displayPanel.getResult());
        Value power = new DoubleValue(2d);
        displayPanel.setResult(new Calculator().root(value, power).toString());
    }

}
