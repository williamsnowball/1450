package RobotMain;


import Robot.Commands.Solenoids.WinchRecoilCommand;
import Robot.Commands.Solenoids.WinchUnleashCommand;
import Robot.Commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OperatorInterface {
    // The right joystick is the driving joystick
    Joystick mJoystick = new Joystick(1);
 

    // The tongue button runs the tongue motor on
    //Button tongueButton = new JoystickButton(rightJoystick,3);
 

    public OperatorInterface() {
        JoystickButton trigger = new JoystickButton(mJoystick,3);
        JoystickButton climber = new JoystickButton(mJoystick,6);
        JoystickButton dumper = new JoystickButton(mJoystick,2);
        JoystickButton ramp = new JoystickButton(mJoystick,8);
        
    }
    


    public double getDriveRotation() {
        return mJoystick.getX();
    }

    public double getDriveThrottle() {

        return mJoystick.getY();
    }


}


