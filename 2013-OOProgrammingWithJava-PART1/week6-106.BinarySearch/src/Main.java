
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] taulukko = {-5, -3, -1, 0, 3, 6, 8, 10};
        Scanner lukija = new Scanner(System.in);

        System.out.println("Numbers in the array " + Arrays.toString(taulukko));
        System.out.println("Size of the array: " + taulukko.length);
        System.out.println();

        System.out.print("Enter searched number: ");
        String etsittavaLuku = lukija.nextLine();
        System.out.println();

        boolean tulos = BinarySearch.search(taulukko, Integer.parseInt(etsittavaLuku));

        if (tulos) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        // Print here the result
        /*
        for (int i = 0; i < taulukko.length; i++) {
            int a = taulukko[i];
            boolean tulos = BinarySearch.search(taulukko, a);
            if (tulos) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
*/
    }
}
