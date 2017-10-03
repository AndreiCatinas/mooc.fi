/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.*;

/**
 *
 * @author Andrey
 */
public class AtLeastOne implements Criterion {
    private List<Criterion> criteria;
    
    public AtLeastOne(Criterion... criteria) {
        this.criteria = new ArrayList<Criterion>();
        for (Criterion a : criteria) {
            this.criteria.add(a);
        }
    }
    @Override
    public boolean complies(String line) {
        for (Criterion c : this.criteria) {
            if (c.complies(line)) {
                return true;
            }
        }
        return false;
    }
    
}
