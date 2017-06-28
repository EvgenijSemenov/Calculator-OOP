package main.java.calculator.view.button.action;

import main.java.calculator.model.Calculator;
import main.java.calculator.model.value.DoubleValue;
import main.java.calculator.model.value.Value;
import main.java.calculator.view.DisplayPanel;

import java.awt.event.ActionEvent;

public class DivideUnitActionListener extends CalculatorActionListener {

    public DivideUnitActionListener(DisplayPanel displayPanel) {
        super(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Value result = new Calculator().divideUnit(new DoubleValue(displayPanel.getResult()));
        displayPanel.setResult(result.toString());
    }

}
