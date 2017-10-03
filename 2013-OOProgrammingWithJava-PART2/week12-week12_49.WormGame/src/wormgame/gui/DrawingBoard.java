/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Andrey
 */
public class DrawingBoard extends JPanel implements Updatable{
    private WormGame game;
    private int pieceLength;

    public DrawingBoard(WormGame game, int pieceLength) {
        this.game = game;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Piece p : game.getWorm().getPieces()) {
            g.setColor(Color.BLACK);
            g.fill3DRect(p.getX()*this.pieceLength, p.getY()*this.pieceLength, pieceLength, pieceLength, true);
        }
        g.setColor(Color.red);
        g.fillOval(game.getApple().getX()* this.pieceLength, game.getApple().getY()* this.pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        super.repaint();
    }
    
    
}
