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

public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    public void Library() {
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book temp : books) {
            System.out.println(temp);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book a : books) {
            if (StringUtils.included(a.title(), title)) {
                temp.add(a);
            }
        }
        return temp;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book a : books) {
            if (StringUtils.included(a.publisher(), publisher)) {
                temp.add(a);
            }
        }
        return temp;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book a : books) {
            if (a.year() == year) {
                temp.add(a);
            }
        }
        return temp;
    }
}
