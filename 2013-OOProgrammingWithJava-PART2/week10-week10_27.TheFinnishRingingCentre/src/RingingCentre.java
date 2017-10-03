/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrey
 */
import java.util.*;

public class RingingCentre {
    private Map<Bird, Set<String>> birds;

    public RingingCentre() {
        this.birds = new HashMap<Bird, Set<String>>();
    }
    
    public void observe(Bird bird, String place) {
        if (birds.containsKey(bird)) {
            birds.get(bird).add(place);
        }
        else {
            birds.put(bird, new HashSet<String>());
            birds.get(bird).add(place);
        }
    }
    
    public void observations(Bird bird) {
        if (birds.containsKey(bird)) {
            System.out.println(bird + " observations: " +  birds.get(bird).size());
            for (String s : birds.get(bird)) {
                System.out.println(s);
            }
        }
        else {
            System.out.println(bird + " observations: 0" );
        }
    }
}
