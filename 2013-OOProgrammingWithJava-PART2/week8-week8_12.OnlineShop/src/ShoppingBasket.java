/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
import java.util.*;

public class ShoppingBasket {

    private List<Purchase> basket = new ArrayList<Purchase>();

    public ShoppingBasket() {
    }

    public void add(String product, int price) {
        Purchase temp = new Purchase(product, 1, price);
        //if (!basket.isEmpty()) {
            if (basket.contains(temp)) {
                basket.get(basket.indexOf(temp)).increaseAmount();
            } else {
                basket.add(new Purchase(product, 1, price));
            }
       // }
    }

    public int price() {
        int total = 0;
        for (Purchase p : basket) {
            total += p.price();
        }
        return total;
    }

    public void print() {
        for (Purchase a : basket) {
            System.out.println(a);
        }
    }
}
