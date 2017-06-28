package main.java.calculator.view;

import main.java.calculator.view.button.NumberButton;
import main.java.calculator.view.button.OperationButton;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class ButtonPanel extends JPanel {

    private final int rows = 6;
    private final int cols = 4;
    private final int hgrap = 5;
    private final int vgrap = 5;

    public ButtonPanel(DisplayPanel displayPanel) {
        setLayout(new GridLayout(rows, cols, hgrap, vgrap));

        LinkedList<JButton> numberButtons = new NumberButton(displayPanel).getButtonList();
        LinkedList<JButton> operationButtons = new OperationButton(displayPanel).getButtonList();

        addButton(numberButtons, operationButtons);
    }

    private void addButton(LinkedList<JButton> numberButtons, LinkedList<JButton> operationButtons) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row < 3) {
                    add(operationButtons.getFirst());
                    operationButtons.remove(operationButtons.getFirst());
                } else {
                    if (col < 4) {
                        add(numberButtons.getFirst());
                        numberButtons.remove(numberButtons.getFirst());
                    } else {
                        add(operationButtons.getFirst());
                        operationButtons.remove(operationButtons.getFirst());
                    }
                }
            }
        }
    }

}
