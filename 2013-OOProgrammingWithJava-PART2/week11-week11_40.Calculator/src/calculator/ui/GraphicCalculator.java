package calculator.ui;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize((new Dimension(300, 150)));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField("");
        container.add(output);
        container.add(input);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton zet = new JButton("Z");
        zet.setEnabled(false);
        
        plus.addActionListener(new ButtonListener(input, output, zet, '+'));
        minus.addActionListener(new ButtonListener(input, output, zet, '-'));
        zet.addActionListener(new ButtonListener(input, output, zet, '*'));
        
        panel.add(plus);
        panel.add(minus);
        panel.add(zet);
        
        container.add(panel);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
