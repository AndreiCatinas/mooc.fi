
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
       NumberStatistics a = new NumberStatistics();
       NumberStatistics e = new NumberStatistics();
       NumberStatistics o = new NumberStatistics();
       
       int n;
       
        System.out.println("Type numbers: ");
        while (true) {
            n = Integer.parseInt(reader.nextLine());
            if (n == -1) {
                break;
            }
            a.addNumber(n);
            if (n % 2 == 0) {
                e.addNumber(n);
            }
            else {
                o.addNumber(n);
            }
       }
        System.out.println("sum: " + a.sum());
        System.out.println("sum of even: " + e.sum());
        System.out.println("sum of odd: " + o.sum());
    }
}
