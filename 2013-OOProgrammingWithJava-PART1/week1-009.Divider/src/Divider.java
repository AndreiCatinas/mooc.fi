
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        float c = (float) a / (float) b;
        String toPrint = "Division: " + a + " / " + b + " = " + c;
        System.out.println(toPrint);
        // Implement your program here. Remember to ask the input from user.
    }
}
