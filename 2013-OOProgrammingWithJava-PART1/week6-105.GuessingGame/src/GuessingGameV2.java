/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */

import java.util.Scanner;

public class GuessingGameV2 {
        private Scanner reader;
 
    public GuessingGameV2() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }
 
    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
 
        // write the guessing logic here
        while (lowerLimit < upperLimit) {
            int middle = average(lowerLimit, upperLimit);
            if (isGreaterThan(middle)) {
                lowerLimit = middle + 1;
            } else {
                upperLimit = middle;
            }
        }
        System.out.println("The number you're thinking of is " + lowerLimit);
 
    }
 
    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int luku) {
        System.out.println("Is your number greater than " + luku + "? (y/n)");
        String answer = this.reader.nextLine();
 
        return answer.equals("y");
    }
 
    public int average(int first, int second) {
        return (first + second) / 2;
    }
 
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
 
        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
 
        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }
 
    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
 
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}

