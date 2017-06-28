package main.java.calculator.view.button;

import main.java.calculator.view.DisplayPanel;
import main.java.calculator.view.button.action.ChangeSignActionListener;
import main.java.calculator.view.button.action.PrintableSymbolActionListener;

public class NumberButton extends ButtonBuilder {

    public NumberButton(DisplayPanel displayPanel) {
        buttons.add(button("7", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("8", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("9", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("4", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("5", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("6", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("1", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("2", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("3", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button("±", new ChangeSignActionListener(displayPanel)));
        buttons.add(button("0", new PrintableSymbolActionListener(displayPanel)));
        buttons.add(button(".", new PrintableSymbolActionListener(displayPanel)));
    }

}
