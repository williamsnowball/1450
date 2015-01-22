package Robot.Subsystems;

import Robot.Commands.Drive.DriveWithJoystick;
import RobotMain.Constants;
import RobotMain.IODefines;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 */
public class DriveTrain extends Subsystem {

    private RobotDrive robotDrive = new RobotDrive(IODefines.LEFT_DRIVE,IODefines.RIGHT_DRIVE);
/**  originally switched around*/
    public DriveTrain() {

    }
/**originally switched around*/
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
    }

    public void arcadeDrive(double throttle, double rotation) {
        robotDrive.arcadeDrive(throttle,rotation);
    }
}
