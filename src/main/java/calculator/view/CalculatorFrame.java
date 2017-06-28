package main.java.calculator.view;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    private int width = 350;
    private int height = 400;

    public CalculatorFrame(DisplayPanel displayPanel, ButtonPanel buttonPanel) {
        super("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 1, 5, 5));

        add(displayPanel);
        add(buttonPanel);

        pack();
        setSize(width, height);
        setVisible(true);
    }

}
