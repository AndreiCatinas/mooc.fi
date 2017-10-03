/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Andrei
 */
import java.util.*;

public class Box implements Thing{

    private int maxCap;
    private ArrayList<Thing> contents = new ArrayList<Thing>();

    public Box(int maxCap) {
        this.maxCap = maxCap;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + this.getVolume() <= this.maxCap) {
            contents.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int s = 0;
        for (Thing t : contents) {
            s += t.getVolume();
        }
        return s;
    }

    @Override
    public String toString() {
        return "things in the box: " + this.getVolume() + " dm^3";
    }
    
    
}
