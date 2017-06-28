package main.java.calculator.view.button.action;

import main.java.calculator.view.DisplayPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeSignActionListener implements ActionListener{

    private DisplayPanel displayPanel;

    public ChangeSignActionListener(DisplayPanel displayPanel) {
        this.displayPanel = displayPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayPanel.changeResultSign();
    }

}
