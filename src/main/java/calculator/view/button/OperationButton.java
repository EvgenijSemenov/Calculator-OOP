package main.java.calculator.view.button;

import main.java.calculator.view.DisplayPanel;
import main.java.calculator.view.button.action.*;

public class OperationButton extends ButtonBuilder{

    public OperationButton(DisplayPanel displayPanel) {
        buttons.add(button("%", new PercentageActionListener(displayPanel)));
        buttons.add(button("√", new RootActionListener(displayPanel)));
        buttons.add(button("x²", new PowerActionListener(displayPanel)));
        buttons.add(button("1/x", new DivideUnitActionListener(displayPanel)));
        buttons.add(button("CE", new ClearResultActionListener(displayPanel)));
        buttons.add(button("C", new ClearActionListener(displayPanel)));
        buttons.add(button("←", new DeleteLastResultSymbolActionListener(displayPanel)));
        buttons.add(button("/", new OperationActionListener(displayPanel)));
        buttons.add(button("*", new OperationActionListener(displayPanel)));
        buttons.add(button("-", new OperationActionListener(displayPanel)));
        buttons.add(button("+", new OperationActionListener(displayPanel)));
        buttons.add(button("=", new CalculateResultActionListener(displayPanel)));
    }

}
