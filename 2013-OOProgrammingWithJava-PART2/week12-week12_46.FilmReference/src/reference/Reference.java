/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.comparator.*;
import reference.domain.*;
        

import java.util.Collections;
import java.util.*;

/**
 *
 * @author Andrey
 */
public class Reference {
    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }
    
    
    public Film recommendFilm(Person person) {
        TreeMap<Film, List<Rating>> films = new TreeMap<Film, List<Rating>>(new FilmComparator(register.filmRatings()));
        films.putAll(register.filmRatings());
        System.out.println(films);
        return films.firstKey();
    }
}
