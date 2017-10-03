
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
    }

    public int differenceInYears(MyDate comparedDate) {
        int days = 0, months = 0, years = 0;
        if (this.earlier(comparedDate)) {
            years = comparedDate.year - this.year;
            months = comparedDate.month - this.month;
            days = comparedDate.day - this.day;
        }
        else {
            years = this.year - comparedDate.year;
            months = this.month - comparedDate.month;
            days = this.day - comparedDate.day;
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
