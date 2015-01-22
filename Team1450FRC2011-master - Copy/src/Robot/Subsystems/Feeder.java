/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Subsystems;

import Robot.Commands.Feeder.FeederOffCommand;
import RobotMain.IODefines;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 * @author keenan
 */
public class Feeder extends Subsystem {
    
    private Jaguar feederMotor = new Jaguar(IODefines.FEEDER_MOTOR);
    
    protected void initDefaultCommand() {
        setDefaultCommand(new FeederOffCommand());
    }
    
    public void feed() {
        feederMotor.set(1.0);
    }
    
    public void unfeed()  {
        feederMotor.set(-1.0);
    }
    
    public void off()  {
        feederMotor.set(0.0);
    }
}
