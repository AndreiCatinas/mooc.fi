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

public class UserInterface {

    public void start() {
        Scanner input = new Scanner(System.in);
        PhoneBook book = new PhoneBook();

        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");

        while (true) {
            System.out.print("command: ");
            String in = input.nextLine();
            if (in.equals("1")) {
                System.out.print("whose number: ");
                String name = input.nextLine();
                System.out.print("number: ");
                String number = input.nextLine();
                book.addPhone(name, number);
            } else if (in.equals("2")) {
                System.out.print("whose number: ");
                String name = input.nextLine();
                book.searchForNumber(name);
            } else if (in.equals("3")) {
                System.out.print("number: ");
                String number = input.nextLine();
                book.searchByPhone(number);
            } else if (in.equals("4")) {
                System.out.print("whose address: ");
                String name = input.nextLine();
                System.out.print("street: ");
                String street = input.nextLine();
                book.addAddress(name, street);
                System.out.print("city: ");
                String city = input.nextLine();
                book.addAddress(name, city);
            } else if (in.equals("5")) {
                System.out.print("whose information: ");
                String name = input.nextLine();
                book.searchPersonalInformation(name);
            } else if (in.equals("6")) {
                System.out.print("whose information: ");
                String name = input.nextLine();
                book.removePerson(name);
            } else if (in.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                String key = input.nextLine();
                book.searchByKeyword(key);
            } else if (in.equals("x")) {
                break;
            }
        }
    }
}
