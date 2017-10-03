package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.setColor(Color.black);
        graphics.fillRect(95, 50, 50, 50);
        graphics.fillRect(245, 50, 50, 50);
        graphics.fillRect(45, 200, 50, 50);
        graphics.fillRect(295, 200, 50, 50);
        graphics.fillRect(95, 250, 200, 50);
    }
}
