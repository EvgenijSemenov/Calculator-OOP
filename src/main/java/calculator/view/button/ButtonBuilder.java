package main.java.calculator.view.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
