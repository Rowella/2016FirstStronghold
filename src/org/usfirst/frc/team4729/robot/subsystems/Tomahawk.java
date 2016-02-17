package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Tomahawk extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Talon tomahawk = new Talon (RobotMap.TOMAHAWK_MOTOR);
	
	public void up() {
		tomahawk.set(0.1);
	}
	
	public void down() {
		tomahawk.set(0.1);
	}
	
	public void stop() {
		tomahawk.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

