package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        // WordInspection test = new WordInspection(file);
        // System.out.println(test);
        // System.out.println(test.wordCount());
        // System.out.println(test.wordsContainingZ());
        // System.out.println(test.wordsEndingInL());
        // System.out.println(test.palindromes());
        // System.out.println(test.wordsWhichContainAllVowels());
        try {
            WordInspection test = new WordInspection(file);
            System.out.println(test.palindromes());
            System.out.println(test.wordsContainingZ());
            System.out.println(test.wordsEndingInL());
        } catch (Exception e) {
            System.out.println("plm");
        }

    }
}
