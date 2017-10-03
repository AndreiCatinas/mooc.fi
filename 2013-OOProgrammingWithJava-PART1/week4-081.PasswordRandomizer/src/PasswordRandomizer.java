import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pswd = "";
        Random rand = new Random();
        int i = this.length;
        while (i > 0) {
            pswd += "abcdefghijklmnopqrstuvwxyz".charAt(rand.nextInt(26));
            i--;
        }
        return pswd;
    }
}
