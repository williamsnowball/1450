package Robot.Subsystems;

import Robot.Commands.Ramp.DefaultShooterCommand;
import Robot.Utils.*;
import RobotMain.IODefines;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 */
public class Ramp extends Subsystem {


 
    public Ramp() {
        requires(ramp);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new DefaultShooterCommand());
    }

    public void resetSpeedSensor() {
        
    }
    
    public void extendRamp(){
        
    }
    
    public void retractRamp(){
        
    }

}
