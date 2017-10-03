
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String aa = reader.nextLine();
        System.out.println("Type your age: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String bb = reader.nextLine();
        System.out.println("Type your age: ");
        int b = Integer.parseInt(reader.nextLine());
        // Implement your program here
        System.out.println(aa + " and " + bb + " are " + (a+b) + " years old in total.");
    }
}
