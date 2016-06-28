package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SpeedSubsystem extends Subsystem {
	public double universalSpeed;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void halfSpeed() {
    	universalSpeed = 0.75;
    }
    
    public void fullSpeed() {
    	universalSpeed = 1;
    }
}

