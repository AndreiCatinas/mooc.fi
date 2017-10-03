/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moving.logic;

import moving.domain.*;
import java.util.*;

/**
 *
 * @author Andrei
 */
public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> temp = new ArrayList<Box>();
        
        temp.add(new Box(this.boxesVolume));
        int i = 0;
        boolean s = true;
        for (Thing t : things) {
            s = temp.get(i).addThing(t);
            if (!s) {
                temp.add(new Box(this.boxesVolume));
                i++;
                temp.get(i).addThing(t);
            }
        }
        return temp;
    }
}
