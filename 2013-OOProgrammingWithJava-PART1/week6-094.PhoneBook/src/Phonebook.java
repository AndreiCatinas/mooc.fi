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

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public void add(String name, String number) {
        persons.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person print : persons) {
            System.out.println(print);
        }
    }
    
    public String searchNumber(String name) {
        for (Person temp : persons) {
            if (temp.getName().equals(name)) {
                return temp.getNumber();
            }
        }
        return "number not known";
    }
}
