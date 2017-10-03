/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */

import java.util.ArrayList;

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> content = new ArrayList<ToBeStored>();
    private double max;

    public Box(double maxWeight) {
        this.max = maxWeight;
    }
    
    public double weight() { 
        double total = 0;
        for (ToBeStored item : content) {
            total += item.weight();
        }
        return total;
    }
    
    public void add(ToBeStored item) {
        if (item.weight() + weight() < max) {
            content.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + content.size() + " things, total weight " + weight() + " kg";
    }
    
    
    
}
