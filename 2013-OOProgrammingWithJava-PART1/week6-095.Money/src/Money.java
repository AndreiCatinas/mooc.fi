
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        return new Money(this.euros() + added.euros(), this.cents() + added.cents());
    }
    
    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
                return true;
            }
        else if (this.cents() < compared.cents() && this.euros() == compared.euros()) {
            return true;
        }
        return false ;
    }
    
    public Money minus(Money subs) {
        int a = this.euros() * 100 + this.cents();
        int b = subs.euros() * 100 + subs.cents();
        int c = a - b;
        if (c > 0) {
            return new Money(c/100, c%100);
        }
        return new Money(0,0);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
