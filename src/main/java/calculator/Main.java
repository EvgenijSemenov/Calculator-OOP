package main.java.calculator;

import main.java.calculator.view.ButtonPanel;
import main.java.calculator.view.CalculatorFrame;
import main.java.calculator.view.DisplayPanel;

public class Main {

    public static void main(String[] args) {
        DisplayPanel displayPanel = new DisplayPanel();
        ButtonPanel buttonPanel = new ButtonPanel(displayPanel);
        CalculatorFrame calculatorFrame = new CalculatorFrame(displayPanel, buttonPanel);
    }

}
