package main.java.calculator.view.button.action;

import main.java.calculator.view.DisplayPanel;
import java.awt.event.ActionEvent;

public class ClearActionListener extends CalculatorActionListener {

    public ClearActionListener(DisplayPanel displayPanel) {
        super(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayPanel.clearAll();
    }

}
