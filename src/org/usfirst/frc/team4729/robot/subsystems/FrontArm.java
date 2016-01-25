package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class FrontArm extends Subsystem {
	Talon frontArmMotor = new Talon(RobotMap.FRONT_ARM_MOTOR);
	
	public void lower() {
		frontArmMotor.set(1);
	}
	
	public void raise() {
		frontArmMotor.set(-1);
	}
	
	public void stop() {
		frontArmMotor.set(0);
	}
	
	protected void initDefaultCommand() {
		
	}
	
}
