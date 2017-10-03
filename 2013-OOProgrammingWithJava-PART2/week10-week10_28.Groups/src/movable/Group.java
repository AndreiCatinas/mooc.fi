/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Andrey
 */

import java.util.*;

public class Group implements Movable{
    private List<Movable> group = new ArrayList<Movable>();
    
    public void addToGroup(Movable movable) {
        group.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : this.group) {
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String temp = "";
        for (Movable m : this.group) {
            temp += m.toString() + "\n";
        }
        return temp;
    }
}
