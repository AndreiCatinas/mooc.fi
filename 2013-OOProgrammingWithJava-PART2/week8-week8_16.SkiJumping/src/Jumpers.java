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

public class Jumpers {
    ArrayList<Jumper> jumpers = new ArrayList<Jumper>();
    
    public void addJumper(Jumper j) {
        jumpers.add(j);
    }
    
    public void reverseJumpers() {
        Collections.reverse(jumpers);
    }
    
    public void sortJumpers() {
        Collections.sort(jumpers);
    }
    
    public void printJumpers() {
        int i = 1;
        for (Jumper j : jumpers) {
            System.out.println("  " + i + ". " + j);
            i++;
        }
    }
    
    public void printResults() {
        int i = 1;
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (Jumper j : jumpers) {
            System.out.print(i + "           ");
            System.out.println(j);
            System.out.print("            ");
            j.printJumps();
            i++;
        }
    }
}
