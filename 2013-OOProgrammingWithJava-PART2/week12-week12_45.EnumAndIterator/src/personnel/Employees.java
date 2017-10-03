/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.*;

/**
 *
 * @author Andrey
 */
public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> pers = persons.iterator();
        while (pers.hasNext()) {
            employees.add(pers.next());
        }
    }

    public void print() {
        Iterator<Person> pers = employees.iterator();
        while (pers.hasNext()) {
            System.out.println(pers.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> pers = employees.iterator();
        while (pers.hasNext()) {
            Person p = pers.next();
            if (p.getEducation().equals(education)) System.out.println(p);
        }
    }

    public void fire(Education education) {
        Iterator<Person> pers = employees.iterator();
        while (pers.hasNext()) {
            if (pers.next().getEducation().equals(education)) pers.remove();
        }
    }
}
