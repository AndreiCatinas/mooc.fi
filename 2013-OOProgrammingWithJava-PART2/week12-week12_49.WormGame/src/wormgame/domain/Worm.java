package wormgame.domain;

import wormgame.*;
import java.util.*;

public class Worm {

    private int originalX;
    private int originalY;
    private Direction direction;
    private ArrayList<Piece> pieces;
    private boolean grows;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.direction = originalDirection;
        pieces = new ArrayList<Piece>();
        pieces.add(new Piece(originalX, originalY));
        this.grows = false;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return pieces.size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void grow() {
        this.grows = true;
    }

    public void move() {
        if (pieces.size() <= 2) {
            grow();
        }
        if (!grows) {
            pieces.remove(0);
            pieces.trimToSize();
            this.grows = false;
        }
        if (this.direction.equals(Direction.LEFT)) {
            pieces.add(new Piece(pieces.get(pieces.size() - 1).getX() - 1, pieces.get(pieces.size() - 1).getY()));
        } else if (this.direction.equals(Direction.RIGHT)) {
            pieces.add(new Piece(pieces.get(pieces.size() - 1).getX() + 1, pieces.get(pieces.size() - 1).getY()));
        } else if (this.direction.equals(Direction.UP)) {
            pieces.add(new Piece(pieces.get(pieces.size() - 1).getX(), pieces.get(pieces.size() - 1).getY() - 1));
        } else if (this.direction.equals(Direction.DOWN)) {
            pieces.add(new Piece(pieces.get(pieces.size() - 1).getX(), pieces.get(pieces.size() - 1).getY() + 1));
        }
        this.grows = false;
    }
    
    public boolean hitsEdge(int width, int height) {
        int x = pieces.get(pieces.size() - 1).getX();
        int y = pieces.get(pieces.size() - 1).getY();
        if (x == 0 || y == 0 || x == width || y == height) {
            return true;
        }
        return false;
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : pieces) {
            if (p.getX() == piece.getX() && p.getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (Piece p : pieces) {
            for (Piece c : pieces) {
                if (p == c) {
                    continue;
                }
                if (p.getX() == c.getX() && p.getY() == c.getY()) {
                    return true;
                }
            }
        }
        return false;
    }
}
