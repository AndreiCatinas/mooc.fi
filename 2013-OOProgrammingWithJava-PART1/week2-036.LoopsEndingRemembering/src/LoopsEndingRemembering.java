import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int s = 0;
        
        System.out.println("Type numbers: ");
        int a = 0, i = 0, o = 0, e = 0;
        while (a != -1 ){
            a = Integer.parseInt(reader.nextLine());
            s += a;
            i++;
            if (a % 2 == 0 && a != -1) {
                e++;
            }
            else if (a % 2 != 0 && a != -1) {
                o++;
            }
        }
        i -= 1;
        s += 1;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + s);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + (double) s / i);
        System.out.println("Even numbers: " + e);
        System.out.println("Odd numbers: " + o);

    }
}
