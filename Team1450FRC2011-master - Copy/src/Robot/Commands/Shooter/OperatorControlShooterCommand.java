package Robot.Commands.Shooter;

import Robot.Commands.CommandBase;

/**
 */
public class OperatorControlShooterCommand  extends CommandBase {

    public OperatorControlShooterCommand() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.throttle(oi.getShooterThrottle());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
