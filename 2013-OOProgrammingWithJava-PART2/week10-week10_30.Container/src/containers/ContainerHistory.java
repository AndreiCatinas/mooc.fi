package containers;

import java.util.*;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double temp = history.get(0);
        for (double d : history) {
            if (d > temp) {
                temp = d;
            }
        }
        return temp;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double temp = history.get(0);
        for (double d : history) {
            if (d < temp) {
                temp = d;
            }
        }
        return temp;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double d : history) {
            sum += d;
        }
        return sum / history.size();
    }

    public double greatestFluctuation() {
        if (history.isEmpty() || history.size() == 1) {
            return 0;
        }
        double diff = 0;
        double temp = 0;
        for (int i = 1; i < history.size(); i++) {
            double a = history.get(i - 1);
            double b = history.get(i);
            if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
                temp = Math.abs(Math.abs(a) - Math.abs(b));
            }
            else {
                temp = Math.abs(Math.abs(a) + Math.abs(b));
            }
            if (diff < temp) {
                diff = temp;
            }
        }
        return diff;
    }

    public double variance() {
        if (history.isEmpty() || history.size() == 1) {
            return 0;
        }
        double var = 0;
        double avg = average();
        for (double d : history) {
            var += Math.pow(d - avg, 2);
        }
        return var / (history.size() - 1);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
