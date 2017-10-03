
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        String nm, stNb;

        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("name: ");
            nm = reader.nextLine();
            if (!nm.isEmpty()) {
                System.out.println("studentNumber: ");
                stNb = reader.nextLine();
                list.add(new Student(nm, stNb));
            }
            else {
                break;
            }
        }
        
        for (Student a : list) {
            System.out.println(a);
        }
        
        System.out.println("Give search term: ");
        String s = reader.nextLine();
        for (Student a : list) {
            if (a.getName().contains(s)) {
                System.out.println("Result: ");
                System.out.println(a);
            }
        }
    }
}
