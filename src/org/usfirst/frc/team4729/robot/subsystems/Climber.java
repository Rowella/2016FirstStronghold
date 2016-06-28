package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
//	Victor measuringTape = new Victor (RobotMap.MEASURING_TAPE_MOTOR);
	
	public void extend() {

	//	measuringTape.set(-0.5);
	}
    
	public void retract() {
	//	measuringTape.set(0.5);
	}
	
	public void stop(){

	//	measuringTape.set(0);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

