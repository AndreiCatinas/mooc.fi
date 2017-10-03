import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        int i = 1;
        int f = 1;
        while (i <= a) {
            f *= i;
            i++;
        }
        System.out.println("Factorial is " + f);
    }
}
