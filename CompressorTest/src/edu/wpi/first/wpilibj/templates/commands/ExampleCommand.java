
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author bradmiller
 */
public class ExampleCommand extends CommandBase {

    DigitalInput ArmLiftLimit = new DigitalInput(2);
    DigitalInput ArmDropLimit = new DigitalInput(3);
    DigitalInput BallProximity = new DigitalInput(8);
    public Joystick left = new Joystick(1);
    public Joystick right = new Joystick(2);
    
    public Solenoid s1 = new Solenoid(1);
    public Solenoid s2 = new Solenoid(2);
    public Solenoid s3 = new Solenoid(3);
    public Solenoid s4 = new Solenoid(4);
    public Solenoid s5 = new Solenoid(5);
    public Solenoid s6 = new Solenoid(6);
    public Solenoid s7 = new Solenoid(7);
    public Solenoid s8 = new Solenoid(8);
    /*
     * 1 - engage claw
3 - disengage claw
2 - disengage reload
4 - engage reload
5 - disengage spring
6 - engage spring
7 - clamp in
8 - clamp out

     */
    public Victor arm = new Victor(3);
    public ExampleCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        s1.set(left.getRawButton(1));
        s2.set(left.getRawButton(2));
        s3.set(left.getRawButton(3));
        s4.set(left.getRawButton(4));
        s5.set(left.getRawButton(5));
        s6.set(left.getRawButton(6));
        s7.set(left.getRawButton(7));
        s8.set(left.getRawButton(8));
        
        if (right.getRawButton(2) && ArmDropLimit.get()){
            System.out.println("Right Button 2 Pressed");
            arm.set(-0.3);
        } else if (right.getRawButton(3) && ArmLiftLimit.get()){
            System.out.println("Right Button 3 Pressed");
            arm.set(0.5);
        } else 
        {
            arm.set(0);
        }
        if (!ArmLiftLimit.get()){
            System.out.println("Limit hit");
        }
        if (!BallProximity.get() && !left.getRawButton(3) && !ArmDropLimit.get()){
            s1.set(true);
        }
        if (BallProximity.get() && !left.getRawButton(1) && !ArmDropLimit.get()){
            s3.set(true);
            
        }
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    }
