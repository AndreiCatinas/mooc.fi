/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author Andrei
 */
public class Thermometer implements Sensor{
    
    private boolean state = false;
    
    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        Random random = new Random();
        if (!isOn()) {
            throw new IllegalStateException("Thermometer off!");
        }
        return random.nextInt(61) + (-30);
    }
}
