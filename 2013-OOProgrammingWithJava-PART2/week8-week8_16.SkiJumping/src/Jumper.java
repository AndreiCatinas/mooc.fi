/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */

import java.util.*;

public class Jumper implements Comparable<Jumper>{
    private String name;
    private int points;
    private ArrayList<Integer> jumps = new ArrayList<Integer>();

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
    }
    
    public void addJump(int j) {
        jumps.add(j);
    }
    
    public void addPoints(int p) {
        this.points += p;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    
    public void printJumps() {
        System.out.print("jump lengths:");
        for (int j : jumps) {
            System.out.print(" " + j + " m,");
        }
        System.out.println("");
    }
    
    @Override
    public int compareTo(Jumper c) {
        return c.points - this.points;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
}
