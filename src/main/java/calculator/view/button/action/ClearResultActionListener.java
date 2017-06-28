package main.java.calculator.view.button.action;

import main.java.calculator.view.DisplayPanel;
import java.awt.event.ActionEvent;

public class ClearResultActionListener extends CalculatorActionListener {

    public ClearResultActionListener(DisplayPanel displayPanel) {
        super(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayPanel.clearResult();
    }

}
