/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot.Commands.Ramp;
import Robot.Commands.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 * @author keenan
 */
public class ActuateRamp extends CommandBase{
    

    protected void initialize() {
        
    }

    protected void execute() {
        shooter.dontSpin();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
