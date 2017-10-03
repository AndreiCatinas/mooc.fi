
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your username: ");
        String usr = reader.nextLine();
        System.out.println("Type your password: ");
        String pswd = reader.nextLine();
        
        if ( usr.equals("alex") ) {
            if (pswd.equals("mightyducks")){
                System.out.println("You are now logged into the system!");
            }
            else {
                System.out.println("Your username or password was invalid!");
            }
        }
        else if ( usr.equals("emily") ) {
            if (pswd.equals("cat")) {
                System.out.println("You are now logged into the system!");
            }
            else {
                System.out.println("Your username or password was invalid!");
            }
        }
        else {
            System.out.println("Your username or password was invalid!");
        }

    }
}
