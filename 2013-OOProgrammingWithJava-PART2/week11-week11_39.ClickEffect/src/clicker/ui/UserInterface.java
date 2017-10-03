package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        frame.setLayout(layout);
        JLabel text = new JLabel("0");
        JButton add = new JButton("Click!");
        ClickListener click = new ClickListener(new PersonalCalculator(), text);
        add.addActionListener(click);
        container.add(text, BorderLayout.NORTH);
        container.add(add, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
