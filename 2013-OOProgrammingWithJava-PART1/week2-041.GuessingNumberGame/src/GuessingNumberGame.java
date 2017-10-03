
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int i = 1;

        System.out.println("Guess a number: ");
        int a = Integer.parseInt(reader.nextLine());
        while (true) {
            if (a < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + i);
            } else if (a > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + i);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            i++;
            System.out.println("Guess a number: ");
            a = Integer.parseInt(reader.nextLine());
        }
        // program your solution here. Do not touch the above lines!

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
