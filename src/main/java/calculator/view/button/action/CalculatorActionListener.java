package main.java.calculator.view.button.action;

import main.java.calculator.view.DisplayPanel;

import java.awt.event.ActionListener;

public abstract class CalculatorActionListener implements ActionListener {

    protected DisplayPanel displayPanel;

    protected CalculatorActionListener(DisplayPanel displayPanel) {
        this.displayPanel = displayPanel;
    }

}
