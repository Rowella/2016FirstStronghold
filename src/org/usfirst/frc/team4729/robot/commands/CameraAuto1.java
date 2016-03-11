package org.usfirst.frc.team4729.robot.commands;

import org.usfirst.frc.team4729.robot.Robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CameraAuto1 extends Command {
	Encoder leftWheel = new Encoder(1,2);
	Encoder rightWheel= new Encoder(3,4);
	
	double wheelAverage;
	double distance = 5;
	double spinDistance = 15.3*Math.PI/360;
	double speed = 0.6;
	boolean isFinished = false;
	
	
	
	
    public CameraAuto1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	leftWheel.startLiveWindowMode();
    	leftWheel.reset();
    	rightWheel.startLiveWindowMode();
    	rightWheel.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	wheelAverage = Math.abs(leftWheel.get() - rightWheel.get());
        if (wheelAverage*spinDistance > distance) {
        	Robot.driveSubsystem.tank(0, 0);
        	isFinished = true;
        	
        }
        else {
        	Robot.driveSubsystem.tank(speed, speed);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (isFinished) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
