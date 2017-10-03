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
import java.util.concurrent.ThreadLocalRandom;

public class UserInterface {
   
    private Jumpers game = new Jumpers();
    
    public void start() {
       
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("  Participant name: ");
            String name = in.nextLine();
            if (name.isEmpty()) {
                break;
            }
            game.addJumper(new Jumper(name));
        }
        
        System.out.println("\nThe tournament begins!\n");

        int i = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String com = in.nextLine();
            if (!com.equals("jump")) {
                System.out.println("\n\nThanks!\n");
                game.sortJumpers();
                game.printResults();
                break;
            }
            System.out.println("\nRound " + i + "\n");
            System.out.println("Jumping order:");
            game.sortJumpers();
            game.reverseJumpers();
            game.printJumpers();
            System.out.println("\nResults of round " + i);
            jump();
            i++;
        }
    }
    
    private void jump() {
        for (Jumper j : game.jumpers) {
            System.out.println("  " + j.getName());
            int length = random(60, 120);
            System.out.println("    length: " + length);
            j.addJump(length);
            j.addPoints(length + judges());
        }
    }
    
    private static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    private static int judges() {
        int [] s = new int[5];
        for (int i = 0; i <= 4; i++) {
            s[i] = random(10, 20);
        }
        System.out.println("    judge votes: [" + s[0] + ", " + s[1] + ", " + s[2] + ", " + s[3] + ", " + s[4] + "]\n" );
        int sum = 0;
        Arrays.sort(s);
        sum  = s[1] + s[2] + s[3];
        return sum;
    }
}
