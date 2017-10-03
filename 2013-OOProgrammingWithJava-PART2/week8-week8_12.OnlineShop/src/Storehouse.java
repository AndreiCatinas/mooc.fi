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

public class Storehouse {

    private Map<String, Integer> store = new HashMap<String, Integer>();
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.store.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (store.containsKey(product)) {
            return store.get(product);
        }
        return -99;

    }

    public int stock(String product) {
       if (stock.containsKey(product)) {
            return stock.get(product);
        }
       return 0;
    }

    public boolean take(String product) {
        if (stock.containsKey(product)) {
            int a = stock.get(product);
            if (a > 0) {
                stock.replace(product, a - 1);
            }
            if (a == 1) {
                stock.remove(product);
            }
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return store.keySet();
    }
    
    
}
