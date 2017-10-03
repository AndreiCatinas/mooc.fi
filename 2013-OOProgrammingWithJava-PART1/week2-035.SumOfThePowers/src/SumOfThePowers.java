
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int p = Integer.parseInt(reader.nextLine());
        int s = 0, i = 0;
        
        while (i <= p ) {
            s += (int)Math.pow(2, i);
            i++;
        }
        System.out.println("The result is " + s);
    }
}
