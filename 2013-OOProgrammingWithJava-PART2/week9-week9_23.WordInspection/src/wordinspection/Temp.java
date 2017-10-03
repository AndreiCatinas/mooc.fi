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
public class Temp {
    private File file;
    
    public Temp(File file) {
        this.file = file;
    }
    
    public List<String> wordsContainingZ() {
        return train(1);
    }
    
    public List<String> wordsEndingInL() {
        return train(2);
    }
    
    public List<String> palindromes() {
        return train(3);
    }
    
    private boolean condition(int n, String s) {
        if (n == 1) {
            return s.contains("z");
        }
        else if (n == 2) {
            return s.endsWith("l");
        }
        else if (n == 3) {
            String temp = new StringBuilder(s).reverse().toString();
            return s.equals(temp);
        }
        return false;
    }
    
    private List<String> train(int n) {
        try {
        Scanner rd = new Scanner(this.file, "UTF-8");
        ArrayList<String> words = new ArrayList<String>();
        while(rd.hasNext()) {
            String curr = rd.nextLine();
            if (condition(n, curr)) {
                words.add(curr);
            }
        }
        return words;
        }
        catch (Exception e) {
            System.out.println("filenotfound");
            return null;
        }
    }
}
