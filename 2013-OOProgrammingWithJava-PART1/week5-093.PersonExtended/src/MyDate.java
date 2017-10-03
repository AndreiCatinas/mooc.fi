
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differeceInYears(MyDate compared) {
        int days = 0, months = 0, years = 0;
        if (this.earlier(compared)) {
            years = compared.year - this.year;
            months = compared.month - this.month;
            days = compared.day - this.day;
        }
        else {
            years = this.year - compared.year;
            months = this.month - compared.month;
            days = this.day - compared.day;
        }
        if (days >= 0) {
            if (months >= 0) {
                if (years >= 0) {
                    return years;
                }
            }
            else {
                return years - 1;
            }
        }
        else {
            return years - 1;
        }
        return 0;
    }

  
}