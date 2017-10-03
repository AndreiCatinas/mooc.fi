/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Andrey
 */
public class ButtonListener implements ActionListener {

    private JTextField output;
    private JTextField input;
    private JButton zet;
    private final char op;

    public ButtonListener(JTextField input, JTextField output, JButton zet, char op) {
        this.input = input;
        this.output = output;
        this.zet = zet;
        this.op = op;
    }

    private String addition() {
        return Integer.parseInt(input.getText()) + Integer.parseInt(output.getText()) + "";
    }

    private String substraction() {
        return Integer.parseInt(output.getText()) - Integer.parseInt(input.getText()) + "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (input.getText().matches("^-?\\d+$") || input.getText().isEmpty()) {
            if (this.op == '+') {
                output.setText(addition());
                input.setText("");
                zet.setEnabled(true);
            } else if (this.op == '-') {
                output.setText(substraction());
                input.setText("");
                zet.setEnabled(true);
            } else if (this.op == '*') {
                output.setText("0");
                input.setText("");
                zet.setEnabled(false);
            }
            if (Integer.parseInt(output.getText()) == 0) {
                zet.setEnabled(false);
            }
        }
        else {
            input.setText("");
        }
    }
}
