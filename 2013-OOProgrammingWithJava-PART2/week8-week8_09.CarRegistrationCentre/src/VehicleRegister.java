/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> catalog = new HashMap<RegistrationPlate, String>();

    public VehicleRegister() {
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!catalog.containsKey(plate)) {
            catalog.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return catalog.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (catalog.containsKey(plate)) {
            catalog.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate a : catalog.keySet()) {
            System.out.println(a);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<String>();
        for (String s : catalog.values()) {
            if (!printed.contains(s)) {
                System.out.println(s);
                printed.add(s);
            }
        }
    }
}
