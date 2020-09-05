package com.swingproject.swingpr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author kan
 */
public class SampleSwingWidget implements ActionListener {
    //class constants

    private static SampleSwingWidget actionListener;
    private static final Color BUTTON_COLOUR1 = Color.WHITE;
    private static final int BUTTON_HEIGHT = 75;
    private static final int BUTTON_WIDTH = 400;
    private static final int TEXTFIELD_HEIGHT = 400;
    private static final int TEXTFIELD_WIDTH = 50;
    private static final String SECONDS_PER_MINUTE = "Seconds to Minutes or Minutes to Seconds";
    private static final String BUTTON2_MODIFIED_LABEL = "yes";
    private static final String POUNDS_PER_KILOGRAM = "Pounds to Kilograms or Kilograms to Pounds";
    private static final String CHANGE_MY_LABEL = "1";
    private static final int HEIGHT = 400;
    private static final int WIDTH = 400;
// instance fields
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    private static JFrame frame;
    private static JTextField textInput;
    private static JPanel panel;

    /**
     * A free-standing frame with two buttons.
     *
     * @param title the title of this frame
     */
    public static void main(String args[]) {
        // Establish the frame.
        frame = new JFrame("Title");
        panel = new JPanel();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        actionListener = new SampleSwingWidget();
        // Establish button dimensions.
        Dimension buttonDimension = new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT);

        // Establish Textfield dimensions.
        Dimension textDimension = new Dimension(TEXTFIELD_HEIGHT, TEXTFIELD_WIDTH);

        // Create and add the first button.
        button1 = new JButton(SECONDS_PER_MINUTE);
        button1.setActionCommand(CHANGE_MY_LABEL);
        button1.addActionListener(actionListener);
        button1.setPreferredSize(buttonDimension);
        button1.setMinimumSize(buttonDimension);
        button1.setMaximumSize(buttonDimension);
        button1.setBackground(BUTTON_COLOUR1);
        panel.add(button1);

        // Create and add the second button.
        button2 = new JButton(POUNDS_PER_KILOGRAM);
        button2.setActionCommand(CHANGE_MY_LABEL);
        button2.addActionListener(actionListener);
        button2.setPreferredSize(buttonDimension);
        button2.setMinimumSize(buttonDimension);
        button2.setMaximumSize(buttonDimension);
        button2.setBackground(BUTTON_COLOUR1);
        panel.add(button2);

        // Create an input text field.
        textInput = new JTextField(20);
        textInput.setPreferredSize(textDimension);
        textInput.setMinimumSize(textDimension);
        textInput.setMaximumSize(textDimension);
        textInput.setHorizontalAlignment(JTextField.CENTER);

        panel.add(textInput, BorderLayout.CENTER);
        String string = textInput.getText();

        frame.add(panel);
        // Display the frame and text field.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    } // end of constructor ButtonDuo

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
