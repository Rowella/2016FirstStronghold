package org.usfirst.frc.team4729.robot.commands;

import org.usfirst.frc.team4729.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoCommand extends Command {
	boolean onObstacle = false;
	boolean isFinished = false;
	Timer timer;
	boolean primed = false;

    public AutoCommand() {
    	timer = new Timer();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.start();
    	Robot.accelerometer.setFlat();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putBoolean("isFinished", isFinished);
    	SmartDashboard.putBoolean("onObstacle", onObstacle);
    	SmartDashboard.putNumber("Timer",timer.get());
    	if (timer.get() > 0.3){
    		primed = true;
    	}
    	if (isFinished){
    		Robot.driveSubsystem.tank(0, 0);
    		SmartDashboard.putString("Progress", "Done");
    		/*if (timer.get() < 3){
    			Robot.shooter.shoot();
    		} else {
    			Robot.shooter.stop();
    		}*/
    	} 
    	else {
    		Robot.driveSubsystem.tank(1, 1);
    		SmartDashboard.putString("Progress", "Running");
    		if ((!Robot.accelerometer.isFlat()) && (primed)){
    			onObstacle = true;
    			timer.reset();
    		} 
    		else {
    			SmartDashboard.putBoolean("flat", true);
    			if ((onObstacle) && (timer.get() > 0.7)){
    				isFinished = true;
    				timer.reset();
    			}
    		}
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
    	Robot.shooter.stop();
    }
}