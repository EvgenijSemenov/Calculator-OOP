package main.java.calculator.view;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    private final int width = 350;
    private final int height = 400;
    private final int rows = 2;
    private final int cols = 1;
    private final int hgap = 5;
    private final int vgap = 5;

    public CalculatorFrame(DisplayPanel displayPanel, ButtonPanel buttonPanel) {
        super("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(rows, cols, hgap, vgap));

        add(displayPanel);
        add(buttonPanel);

        pack();
        setSize(width, height);
        setVisible(true);
    }

}
