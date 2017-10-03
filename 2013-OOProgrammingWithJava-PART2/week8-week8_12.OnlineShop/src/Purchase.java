/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return amount * unitPrice;
    }
    
    public void increaseAmount() {
        this.amount++;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }

    @Override
    public int hashCode() {
        if (this.product.isEmpty()) {
            return 3;
        }
        return this.product.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Purchase other = (Purchase) obj;
        if ((this.product == null) ? (other.product != null) : !this.product.equals(other.product)) {
            return false;
        }
        return true;
    }
    
    
}
