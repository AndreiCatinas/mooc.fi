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

public class Container {

    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    private int totalWeight() {
        int total = 0;
        for (Suitcase a : suitcases) {
            total += a.totalWeight();
        }
        return total;
    }

    public void printThings() {
        for (Suitcase a : suitcases) {
            a.printThings();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

}
