/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        String temp1 = word.trim().toLowerCase();
        String temp2 = searched.trim().toLowerCase();
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        }
        if (temp1.contains(temp2)) {
            return true;
        }
        return false;
    }
}
