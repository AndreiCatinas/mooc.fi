/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Andrei
 */
import java.util.*;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Integer> averages = new ArrayList<Integer>();

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    public List<Integer> readings() {
        return averages;
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        int sum = 0;
        for (Sensor s : sensors) {
            sum += s.measure();
        }
        int r = (int) sum / sensors.size();
        averages.add(r);
        return r;
    }

}
