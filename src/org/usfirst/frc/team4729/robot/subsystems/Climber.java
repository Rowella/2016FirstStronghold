package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	Talon climber = new Talon(RobotMap.CLIMBER_MOTOR);
	Talon measuringTape = new Talon(RobotMap.MEASURING_TAPE_MOTOR);
	
	public void extend() {
		climber.set(1);
		measuringTape.set(1);
	}
    
	public void retract() {
		climber.set(-1);
		measuringTape.set(-1);
	}
	
	public void stop(){
		climber.set(0);
		measuringTape.set(0);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

