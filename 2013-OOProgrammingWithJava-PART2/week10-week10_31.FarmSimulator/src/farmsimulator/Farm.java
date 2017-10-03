/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class Farm implements Alive {

    private String owner;
    private ArrayList<Cow> cows;
    private Barn barn;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }

    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }
    
    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public void manageCows() {
        barn.takeCareOf(cows);
    }
    
    public String getOwner() {
        return this.owner;
    }

    @Override
    public void liveHour() {
        for (Cow c : cows) {
            c.liveHour();
        }
    }
    
    @Override
    public String toString() {
        String mu = "";
        for (Cow c : cows) {
            mu += "        " + c + "\n";
        }
        return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + barn.toString() 
                + "\n" + "Animals: " + mu;
    }
}
