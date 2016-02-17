package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {
	
	//Talon winch = new Talon (RobotMap.LIFT_MOTOR);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
/*	public void extend() {
		winch.set(1);
	}
	
	public void retract() {
		winch.set(-1);
	}
	
	public void stop() {
		winch.set(0);
	} */

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

