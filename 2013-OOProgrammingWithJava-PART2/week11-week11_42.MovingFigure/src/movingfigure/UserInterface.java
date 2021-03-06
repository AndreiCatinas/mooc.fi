package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;

    public UserInterface(Figure figure) {
        this.figure = figure;
    }
    
    

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(800, 800));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard drawingBoard = new DrawingBoard(figure);
        container.add(drawingBoard);
    }

    private void addListeners() {
        frame.addKeyListener(new KeyboardListener(frame.getComponent(0), figure));
    }

    public JFrame getFrame() {
        return frame;
    }
}
