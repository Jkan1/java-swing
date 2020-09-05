package com.swingproject.swingpr;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author kan
 */
public class SampleSwing implements ActionListener {

    static final String CLICK_BUTTON = "Click";

    private static ActionListener actionListener;
    private static JFrame frame;
    private static JTextField text1;
    private static JButton b1;
    private static JPanel panel;

    private int trigger = 1;

    public static void main(String args[]) {

        actionListener = new SampleSwing();

        frame = new JFrame();

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        text1 = new JTextField(20);
        text1.setBounds(100, 50, 200, 20);
        text1.setText("Welcom To Swing App");
        text1.setEditable(false);

        b1 = new JButton(CLICK_BUTTON);
        b1.setBounds(150, 100, 100, 40);
        b1.addActionListener(actionListener);

        frame.add(b1);
        frame.add(text1);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override()
    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();
        System.out.println("Button Pressed : " + s);
        if (s.equals(CLICK_BUTTON)) {
            if (trigger == 1) {
                text1.setText("Hello There!");
                trigger = 2;
            } else {
                text1.setText("Welcom To Swing App");
                trigger = 1;
            }
        }
    }
}
