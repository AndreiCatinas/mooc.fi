/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrey
 */
import java.util.*;

public class PhoneBook {

    private Map<String, Set<String>> phone;
    private Map<String, Set<String>> address;

    public PhoneBook() {
        this.phone = new HashMap<String, Set<String>>();
        this.address = new HashMap<String, Set<String>>();
    }

    public void addPhone(String name, String phone) {
        if (this.phone.containsKey(name)) {
            this.phone.get(name).add(phone);
        } else {
            this.phone.put(name, new HashSet<String>());
            this.phone.get(name).add(phone);
        }
    }

    public void addAddress(String name, String address) {
        if (this.address.containsKey(name)) {
            this.address.get(name).add(address);
        } else {
            this.address.put(name, new HashSet<String>());
            this.address.get(name).add(address);
        }
    }

    public void searchForNumber(String name) {
        if (!phone.containsKey(name)) {
            System.out.println("  not found");
        } else {
            for (String nb : phone.get(name)) {
                System.out.println(" " + nb);
            }
        }
    }

    public void searchByPhone(String phone) {
        boolean found = false;
        for (String name : this.phone.keySet()) {
            for (String ph : this.phone.get(name)) {
                if (ph.equals(phone)) {
                    System.out.println(" " + name);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println(" not found");
        }
    }

    public void searchPersonalInformation(String name) {
        if (!this.phone.containsKey(name) && !this.address.containsKey(name)) {
            System.out.println("  not found");
        } else {
            if (this.address.containsKey(name)) {
                if (!this.address.get(name).isEmpty()) {
                    System.out.print("  address: ");
                    String add = String.join(" ", this.address.get(name));
                    System.out.println(add);
                }
            } else {
                System.out.println("  address unknown");
            }
            if (this.phone.containsKey(name)) {
                if (!this.phone.get(name).isEmpty()) {
                    System.out.println("  phone numbers:");
                    for (String p : this.phone.get(name)) {
                        System.out.println("   " + p);
                    }
                }
            } else {
                System.out.println("  phone number not found");
            }
        }
    }

    public void searchByKeyword(String key) {
        Map<String, Set<String>> temp = new HashMap<String, Set<String>>();
        for (String s : this.phone.keySet()) {
            boolean found = false;
            if (this.phone.containsKey(s)) {
                for (String v : this.phone.get(s)) {
                    if (v.contains(key)) {
                        found = true;
                        break;
                    }
                }
                if (s.contains(key) || found) {
                    temp.put(s, this.phone.get(s));
                }
            }
        }
        for (String s : this.address.keySet()) {
            boolean found = false;
            if (this.address.containsKey(s)) {
                for (String v : this.address.get(s)) {
                    if (v.contains(key)) {
                        found = true;
                        break;
                    }
                }
                if (s.contains(key) || found) {
                    temp.put(s, this.address.get(s));
                }
            }
        }
        if (temp.isEmpty()) {
            System.out.println(" keyword not found");
        }
        else {
            Map <String, Set<String>> temp2 = new TreeMap<String, Set<String>>(temp);
            for (String s : temp2.keySet()) {
                System.out.println(s);
                searchPersonalInformation(s);
            }
        }
    }

    public void removePerson(String name) {
        if (this.phone.containsKey(name)) {
            this.phone.remove(name);
        }
        if (this.address.containsKey(name)) {
            this.address.remove(name);
        }
    }

}
