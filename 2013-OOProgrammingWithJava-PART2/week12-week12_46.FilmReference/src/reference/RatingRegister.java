/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import reference.domain.*;

/**
 *
 * @author Andrey
 */
public class RatingRegister {

    private Map<Film, List<Rating>> register;
    private Map<Person, Map<Film, Rating>> personalRating;

    public RatingRegister() {
        register = new HashMap<Film, List<Rating>>();
        personalRating = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personalRating.containsKey(person)) {
            personalRating.put(person, new HashMap<Film, Rating>());
        }
        personalRating.get(person).put(film, rating);
        addRating(film, rating);
    }

    public void addRating(Film film, Rating rating) {
        if (!register.containsKey(film)) {
            register.put(film, new ArrayList<Rating>());
        }
        register.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        return register.get(film);
    }

    public Rating getRating(Person person, Film film) {
        if (personalRating.get(person).get(film) != null) {
            return personalRating.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personalRating.containsKey(person)) {
            return personalRating.get(person);
        }
        return new HashMap<Film, Rating>();
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(personalRating.keySet());
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.register;
    }
}
