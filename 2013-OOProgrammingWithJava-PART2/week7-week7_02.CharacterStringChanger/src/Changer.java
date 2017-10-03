/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */

import java.util.ArrayList;

public class Changer {
    ArrayList<Change> listOfChanges = new ArrayList<Change>();

    public Changer() {
    }
    
    public void addChange(Change change) {
        listOfChanges.add(change);
    }
    
    public String change(String characterString) {
        for (Change cc : listOfChanges) {
            characterString = cc.change(characterString);
        }
        return characterString;
    }
}
