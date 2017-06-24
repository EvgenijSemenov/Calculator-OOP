package main.java.calculator.view;

import javax.swing.*;

public class CalculatorFrame extends JFrame {

    private int width = 350;
    private int height = 400;

    public CalculatorFrame() {
        super("Calculator");

        this.setSize(width, height);
        this.setVisible(true);
    }

}
