/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Andrey
 */
public class Both implements Criterion {
    private Criterion one;
    private Criterion two;

    public Both(Criterion one, Criterion two) {
        this.one = one;
        this.two = two;
    }
    
    @Override
    public boolean complies(String line) {
        if (one.complies(line) && two.complies(line)) {
            return true;
        }
        return false;
    }
    
}
