package main.java.calculator;

import main.java.calculator.view.CalculatorFrame;
import main.java.calculator.view.DisplayPanel;

public class Main {

    public static void main(String[] args) {
        DisplayPanel displayPanel = new DisplayPanel();
        CalculatorFrame calculatorFrame = new CalculatorFrame(displayPanel);
    }

}
