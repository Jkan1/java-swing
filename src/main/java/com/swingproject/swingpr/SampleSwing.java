package com.swingproject.swingpr;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author kan
 */
public class SampleSwing {

    public static void main(String args[]) {
        JFrame frame = new JFrame();

        final JTextField tf = new JTextField(20);
        tf.setBounds(50, 50, 150, 20);
        tf.setText("Welcom To Swing App");
        tf.setEditable(false);
        JButton b1 = new JButton("Click!");
        b1.setBounds(130, 100, 100, 40);
        b1.addActionListener(new ActionListener() {
            int trigger = 1;

            public void actionPerformed(ActionEvent e) {

                String s = e.getActionCommand();
                System.out.println("Button Pressed : " + s);
                if (trigger == 1) {
                    tf.setText("Hello There!");
                    trigger = 2;
                } else {
                    tf.setText("Welcom To Swing App");
                    trigger = 1;
                }
            }
        });

        JPanel panel = new JPanel();

        frame.add(b1);
        frame.add(tf);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
