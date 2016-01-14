package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
	RobotDrive driveTrain = new RobotDrive(0,1);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void tankDrive(double leftValue, double rightValue){
    	driveTrain.tankDrive(leftValue, rightValue);
    }
    
    public void arcadeDrive(double forwardValue, double turnValue){
    	driveTrain.arcadeDrive(forwardValue, turnValue);
    }
}

