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
public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot() {
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        if (tank == null) {
            return null;
        }
        return tank;
    }
    
    public void milk(Milkable milkable) {
        if (tank == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        tank.addToTank(milkable.milk());
    }
}
