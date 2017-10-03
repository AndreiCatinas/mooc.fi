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

public class BirdsDb {

    private ArrayList<Bird> birds = new ArrayList<Bird>();

    public BirdsDb() {
    }

    public void add(String name, String latin) {
        birds.add(new Bird(name, latin));
    }

    public void observation(String bird) {
        boolean obs = false;
        for (Bird a : birds) {
            if (a.getName().equals(bird)) {
                a.observed();
                obs = true;
            }
        }
        if (!obs) {
            System.out.println("Is not a bird!");
        }
    }

    public void show(String name) {
        boolean obs = false;
        for (Bird a : birds) {
            if (a.getName().equals(name)) {
                System.out.println(a);
                obs = true;
            }
        }
        if (!obs) {
            System.out.println("Is not a bird!");
        }
    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
