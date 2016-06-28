package org.usfirst.frc.team4729.robot.commands;

import org.usfirst.frc.team4729.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TomahawksUp extends Command {

    public TomahawksUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.tomahawk);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.tomahawk.up();
    	Robot.camServo.camUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	/*if (Robot.limitSwitch.isLower()) {
    		SmartDashboard.putString("Tomahawk limit", "At upper limit");
        	return true;
        }
        
        else {
        	SmartDashboard.putString("Tomahawk limit", "Clear");
        	return false;
        } */
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.tomahawk.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.tomahawk.stop();
    	Robot.camServo.stop();
    }
}
