/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Andrey
 */

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> strings; 
    private int dups;

    public PersonalDuplicateRemover() {
        strings = new HashSet<String>();
        this.dups = 0;
    }

    @Override
    public void add(String characterString) {
        if (!this.strings.contains(characterString)) {
        this.strings.add(characterString);
        }
        else {
            this.dups++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.dups;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.strings;
    }

    @Override
    public void empty() {
        this.strings.clear();
        this.dups = 0;
    }

}
