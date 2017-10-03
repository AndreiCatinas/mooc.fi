
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Type a temperature: ");
            double a = Double.parseDouble(reader.nextLine());
            if (a > -30 && a < 40) {
                Graph.addNumber(a);
            }

        }

        /*
        // Graph is used as follows:
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
         */
    }
}
