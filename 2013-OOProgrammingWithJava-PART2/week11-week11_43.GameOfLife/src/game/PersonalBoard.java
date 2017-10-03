/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.*;
import java.util.Random;

/**
 *
 * @author Andrey
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random rand = new Random();
        for (int j = 0; j < getHeight(); j++) {
            for (int i = 0; i < getWidth(); i++) {
                double temp = rand.nextDouble();
                if (temp < d) getBoard()[i][j] = true;
                else getBoard()[i][j] = false;
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (x <= getWidth()-1 && x >= 0 && y <= getHeight()-1 && y >= 0) {
            return getBoard()[x][y];
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (x <= getWidth() && x >= 0 && y <= getHeight() && y >= 0) {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x <= getWidth() && x >= 0 && y <= getHeight() && y >= 0) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int numberOfLivingNeighbours = 0;
        for (int j = Math.max(y-1, 0); j <= Math.min(y+1, getHeight()-1); j++) {
            for (int i = Math.max(x-1, 0); i <= Math.min(x+1, getWidth()-1); i++) {
                //System.out.println("i: " + i + " j: " + j + " " + getBoard()[i][j]);
                if (getBoard()[i][j]) numberOfLivingNeighbours++;
            }
        }
        return isAlive(x,y) ? numberOfLivingNeighbours-1 : numberOfLivingNeighbours;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (livingNeighbours < 2) turnToDead(x, y);
        if (livingNeighbours > 3) turnToDead(x, y);
        if (livingNeighbours == 3) turnToLiving(x, y);
    }
}
