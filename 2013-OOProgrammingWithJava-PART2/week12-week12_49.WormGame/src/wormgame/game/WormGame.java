package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;
import java.util.concurrent.ThreadLocalRandom;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        this.worm = new Worm((width / 2), (height / 2), Direction.DOWN);
        newApple();
    }
    
    private void newApple() {
        this.apple = new Apple(ThreadLocalRandom.current().nextInt(0, width), ThreadLocalRandom.current().nextInt(0, height));
        while (worm.runsInto(apple)) {
            this.apple = new Apple(ThreadLocalRandom.current().nextInt(0, width), ThreadLocalRandom.current().nextInt(0, height));
        }
        
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public Worm getWorm() {
        return this.worm;
    }
    
    public void setWorm(Worm worm) {
        this.worm = worm;
    }
    
    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    public Apple getApple() {
        return this.apple;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            newApple();
        }
        if (worm.hitsEdge(width, height)) {
            this.continues = false;
        }
        if (worm.runsIntoItself()) {
            this.continues = false;
        }
        updatable.update();
        setDelay(1000 / worm.getLength());
    }

}
