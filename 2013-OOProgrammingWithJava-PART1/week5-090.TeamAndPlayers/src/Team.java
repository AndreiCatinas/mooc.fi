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

public class Team {

    private String name;
    private int max;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.max = 16;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (this.max > players.size()) {
            players.add(player);
        }
    }

    public void printPlayers() {
        for (Player a : players) {
            System.out.println(a);
        }
    }

    public void setMaxSize(int maxSize) {
        this.max = maxSize;
    }

    public int size() {
        return this.players.size();
    }
    
    public int goals () {
        int s = 0;
        for (Player a : players) {
            s += a.goals();
        }
        return s;
    }
}

