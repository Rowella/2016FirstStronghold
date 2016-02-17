package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {
	
	Victor climber = new Victor (RobotMap.CLIMBER_MOTOR);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
public void extend() {
		climber.set(1);
	}
	
	public void retract() {
		climber.set(-1);
	}
	
	public void stop() {
		climber.set(0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

