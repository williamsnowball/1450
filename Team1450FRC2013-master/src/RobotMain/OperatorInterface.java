package RobotMain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OperatorInterface {
    // The right joystick is the driving joystick
    Joystick rightJoystick = new Joystick(1);
    // The left joystick is the shooting joystick
    Joystick leftJoystick = new Joystick(2);

    Button cameraLights = new JoystickButton(leftJoystick,2);
    // The tongue button runs the tongue motor on
    //Button tongueButton = new JoystickButton(rightJoystick,3);
    // the shooter uses the ramp motor to deliver balls to the trigger
//    Button shooterRampButton = new JoystickButton(leftJoystick,5);
//
//    // shoot the ball
//    Button triggerButton = new JoystickButton(leftJoystick,1);
//    
//    Button cameraPickupButton = new JoystickButton(rightJoystick,9);
//    Button cameraTargetButton = new JoystickButton(leftJoystick,9);
//
//    Button shooterArcIncrementButton = new JoystickButton(leftJoystick,6);
//    Button shooterArcDecrementButton = new JoystickButton(leftJoystick,7);
//    
//    Button feedButton = new JoystickButton(leftJoystick, 3);
//    Button unfeedButton = new JoystickButton(leftJoystick, 2);
//
//    Button turboButton = new JoystickButton(leftJoystick,7);
    
    public OperatorInterface() {
        cameraLights.whenPressed(null);
       
    }

    public double getDriveRotation() {
        //return -leftJoystick.getX();      //BH commented this out to switch to XBox Controller
        return -leftJoystick.getRawAxis(1);
    }

    public double getDriveThrottle() {
        //return leftJoystick.getY();       //BH commented this out to switch to XBox Controller
        return leftJoystick.getRawAxis(2);
    }

    public double getShooterThrottle() {
        return (-leftJoystick.getZ() + 1.0) / 2.0;
    }
    
    public double getShooter2Throttle() {
        return (-rightJoystick.getZ() + 1.0) / 2.0;
    }
    
    public double getArmRotation() {
        return rightJoystick.getY();
    }
}


