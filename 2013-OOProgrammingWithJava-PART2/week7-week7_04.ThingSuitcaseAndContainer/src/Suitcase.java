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

public class Suitcase {

    private ArrayList<Thing> items = new ArrayList<Thing>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if ((thing.getWeight() + this.totalWeight()) <= maxWeight) {
            items.add(thing);
        }
    }
    
    public void printThings () {
        for (Thing p : items) {
            System.out.println(p);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing a : items) {
            totalWeight += a.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        if (items.isEmpty()) {
            return null;
        }
        Thing a = items.get(0);
        for (Thing b : items) {
            if (a.getWeight() < b.getWeight()) {
                a = b;
            }
        }
        return a;
    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return "empty (0 kg)";
        }
        else if (items.size() == 1) {
            return "1 thing (" + this.totalWeight() + " kg)";
        }
        return items.size() + " things (" + this.totalWeight() + " kg)";
    }

}
