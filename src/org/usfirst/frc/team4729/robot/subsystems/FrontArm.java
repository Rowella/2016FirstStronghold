package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class FrontArm extends Subsystem {
	Talon frontArmMotor = new Talon(RobotMap.FRONT_ARM_MOTOR);
	Encoder frontArmEncoder = new Encoder(6, 8);
	
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
		frontArmEncoder.startLiveWindowMode();
		frontArmEncoder.reset();
		
	}
	
	public double readFrontArmEncoder(){
		SmartDashboard.putNumber("frontArm", frontArmEncoder.get());
		return frontArmEncoder.get();
	}
	
}
