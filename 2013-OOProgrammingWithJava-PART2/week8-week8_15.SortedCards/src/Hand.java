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

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand = new ArrayList<Card>();


    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        for (Card a : hand) {
            System.out.println(a);
        }
    }
    
    public void sort() {
        hand.sort(new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                if (c1.getValue() == c2.getValue()) {
            return c1.getSuit() - c2.getSuit();
        }
        return c1.getValue() - c2.getValue();
            }
        });
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        Collections.sort(hand, sorter);
    }
    
    @Override
    public int compareTo(Hand compared) {
        int a = 0;
        int b = 0;
        for (Card c : this.hand) {
            a += c.getValue();
        }
        for (Card c : compared.hand) {
            b += c.getValue();
        }
        return a - b;
    }
}
