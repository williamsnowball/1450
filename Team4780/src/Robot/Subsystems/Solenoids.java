/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Subsystems;

import Robot.Commands.Solenoids.WinchOffCommand;
import RobotMain.IODefines;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 * @author keenan
 */
public class Solenoids extends Subsystem {
       
    protected void initDefaultCommand() {
        setDefaultCommand(new WinchOffCommand());
    }
    
    public void off()  {
       
    }
}
