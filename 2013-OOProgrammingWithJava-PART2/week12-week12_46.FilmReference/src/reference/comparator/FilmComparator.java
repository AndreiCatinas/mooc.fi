/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.*;
import reference.domain.*;

/**
 *
 * @author Andrey
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> films;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.films = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        if (average(films.get(o1)) >= average(films.get(o2))) {
            return -1;
        }
        else {
            return 1;
        }
    }

    private double average(List<Rating> ratings) {
        int sum = 0;
        for (Rating r : ratings) {
            sum += r.getValue();
        }

        return (double) sum / ratings.size();
    }
}
