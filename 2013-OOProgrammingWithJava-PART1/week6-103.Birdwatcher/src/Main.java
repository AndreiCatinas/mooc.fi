import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            Scanner reader = new Scanner(System.in);
            BirdsDb test = new BirdsDb();
            
            while (true) {
                System.out.print("?");
                String tmp = reader.nextLine();
                if (tmp.equals("Quit")) {
                    break;
                }
                else if (tmp.equals("Add")) {
                    System.out.print("Name: ");
                    String name = reader.nextLine();
                    System.out.print("Latin Name: ");
                    String latin = reader.nextLine();
                    test.add(name, latin);
                }
                else if (tmp.equals("Observation")) {
                    System.out.print("What was observed:?");
                    String name  = reader.nextLine();
                    test.observation(name);
                }
                else if (tmp.equals("Show")) {
                    System.out.println("What?");
                    String name = reader.nextLine();
                    test.show(name);
                }
                else if (tmp.equals("Statistics")) {
                    test.statistics();
                }
            }
    }

}
