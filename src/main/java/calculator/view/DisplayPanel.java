package main.java.calculator.view;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private final int rows = 2;
    private final int cols = 1;
    private JLabel expressionLabel = new JLabel();
    private JLabel resultLabel = new JLabel("0");
    private boolean expressionLabelChanged = false;

    public DisplayPanel() {
        setLayout(new GridLayout(rows, cols));
        add(expressionLabel);
        add(resultLabel);
    }

    public void clearResult() {
        resultLabel.setText("0");
    }

    public void clearExpression() {
        expressionLabel.setText("");
    }

    public void clearAll() {
        clearExpression();
        clearResult();
    }

    public void deleteLastResultSymbol() {
        if (resultLabel.getText().length() > 1 || resultLabel.getText().startsWith("-")) {
            resultLabel.setText(resultLabel.getText().substring(0, resultLabel.getText().length() - 1));
        } else {
            resultLabel.setText("0");
        }
    }

    public void changeResultSign() {
        if (resultLabel.getText().equals("0")) {
            return;
        }

        String result = resultLabel.getText();
        if (result.startsWith("-")) {
            resultLabel.setText(result.substring(1, result.length()));
        } else {
            resultLabel.setText("-" + result);
        }
    }

    public void updateResult(String text) {
        if (text.equals(".") && resultLabel.getText().contains(".")) {

            return;
        }

        if (text.length() == 0) {
            resultLabel.setText("0");
        } else if (resultLabel.getText().equals("0") || expressionLabelChanged) {
            resultLabel.setText(text);
            expressionLabelChanged = false;
        } else {
            resultLabel.setText(resultLabel.getText() + text);
        }
    }

    public String getResult() {
        return resultLabel.getText();
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public String getExpression() {
        return expressionLabel.getText();
    }

    public void setExpression(String text) {
        expressionLabel.setText(text);
        expressionLabelChanged = true;
    }

}
