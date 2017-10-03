/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Andrey
 */
import java.util.concurrent.ThreadLocalRandom;

public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private double milk;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };

    public Cow() {
        int rn = ThreadLocalRandom.current().nextInt(0, 32);
        this.name = NAMES[rn];
        rn = ThreadLocalRandom.current().nextInt(15, 41);
        this.capacity = rn;
        this.milk = 0;
    }

    public Cow(String name) {
        this.name = name;
        double rn = ThreadLocalRandom.current().nextInt(15, 41);
        this.capacity = rn;
        this.milk = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return this.milk;
    }

    @Override
    public double milk() {
        double m = this.milk;
        this.milk = 0;
        return m;
    }

    @Override
    public void liveHour() {
        double m = ThreadLocalRandom.current().nextDouble(0.7, 2);
        if (m + this.milk > capacity) {
            this.milk = capacity;
        } else {
            this.milk += m;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(getAmount()) + "/" + this.capacity;
    }

}
