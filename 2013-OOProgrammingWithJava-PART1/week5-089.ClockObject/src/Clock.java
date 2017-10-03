
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.seconds = new BoundedCounter(59);
        this.seconds.setValue(secondsAtBeginning);

        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);

        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);

    }

    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

    @Override
    public String toString() {
        // returns the string representation
        String hr = "" + this.hours.getValue();
        String mn = "" + this.minutes.getValue();
        String sc = "" + this.seconds.getValue();
        if (this.hours.getValue() <= 9) {
            hr = "0" + hr;
        }
        if (this.minutes.getValue() <= 9) {
            mn = "0" + mn;
        }
        if (this.seconds.getValue() <= 9) {
            sc = "0" + sc;
        }

        return hr + ":" + mn + ":" + sc;
    }
}
