package main.java.calculator.view.button;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public abstract class ButtonBuilder extends JPanel {

    protected LinkedList<JButton> buttons = new LinkedList<JButton>();

    protected JButton button(String text, ActionListener handler) {
        JButton button = new JButton(text);
        button.addActionListener(handler);
        return button;
    }

    public LinkedList<JButton> getButtonList() {
        return buttons;
    }

}
