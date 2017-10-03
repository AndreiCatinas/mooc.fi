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
public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace() {
        return capacity - volume;
    }
    
    public void addToTank(double amount) {
        if (amount <= 0) {
            return;
        }
        if (amount + volume <= capacity) {
            volume += amount;
        }
        else {
            volume = capacity;
        }
    }
    
    public double getFromTank(double amount) {
        if (volume - amount < 0) {
            this.volume = 0;
            return volume;
        }
        else {
            volume -= amount;
        }
        return amount;
    }
    
    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
    
}
