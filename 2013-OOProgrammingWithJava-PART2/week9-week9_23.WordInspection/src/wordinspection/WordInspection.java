/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.*;

/**
 *
 * @author Andrey
 */
public class WordInspection {

    private ArrayList<String> contents = new ArrayList<String>();

    public WordInspection(File file) throws Exception {
        Scanner rd = null;
        try {
            rd = new Scanner(file, "UTF-8");
        } catch (Exception e) {
            System.out.println("File not found!");
            return;
        }
        while (rd.hasNext()) {
            String temp = rd.nextLine();
            contents.add(temp);
        }
    }

    public int wordCount() {
        return this.contents.size();
    }

    public List<String> wordsContainingZ() {
        ArrayList<String> words = new ArrayList<String>();
        for (String s : this.contents) {
            if (s.contains("z")) {
                words.add(s);
            }
        }
        return words;
    }

    public List<String> wordsEndingInL() {
        ArrayList<String> words = new ArrayList<String>();
        for (String s : contents) {
            if (s.endsWith("l")) {
                words.add(s);
            }
        }
        return words;
    }

    public List<String> palindromes() {
        ArrayList<String> words = new ArrayList<String>();
        for (String s : contents) {
            String temp = new StringBuilder(s).reverse().toString();
            if (s.equals(temp)) {
                words.add(s);
            }
        }
        return words;
    }

    public List<String> wordsWhichContainAllVowels() {
        ArrayList<String> words = new ArrayList<String>();
        for (String s : contents) {
            boolean add = true;
            for (char a : "aeiouyäö".toCharArray() ) {
                if (!s.contains(""+a)) {
                    add = false;
                    break;
                }
            }
            if (add) {
                words.add(s);
            }
        }
        return words;
    }


    @Override
    public String toString() {
        String str = "";
        for (String s : contents) {
            str += s + " ";
        }
        return str;
    }

}
