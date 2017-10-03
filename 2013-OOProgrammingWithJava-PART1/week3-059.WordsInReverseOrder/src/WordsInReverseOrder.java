
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String word;
        System.out.println("Type a word: ");
        while (true) {
            word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            } else {
                words.add(word);
            }
            System.out.println("Type a word: ");
        }
        System.out.println("You typed the following words: ");
        //Collections.sort(words);
        Collections.reverse(words);
        for (String a : words) {
            System.out.println(a);
        }
    }
}
