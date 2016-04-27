package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class FrontArm extends Subsystem {
	Talon frontArmMotor = new Talon(RobotMap.FRONT_ARM_MOTOR);
	public double speed = 0.3;
	//Encoder frontArmEncoder = new Encoder(6, 8);
	
	public void changeSpeed() {
		if (speed == 0.3) {
			speed = 0.1;
		}
		
		else {
			speed = 0.3;
		}
	}
	
	public void lower() {
		frontArmMotor.set(speed);
	}
	
	public void raise() {
		frontArmMotor.set(-speed);
	}
	
	public void stop() {
		frontArmMotor.set(0);
	}
	
	protected void initDefaultCommand() {
		//frontArmEncoder.startLiveWindowMode();
		//frontArmEncoder.reset();
		
	}
	
/*	public double readFrontArmEncoder(){
		SmartDashboard.putNumber("frontArm", frontArmEncoder.get());
		return frontArmEncoder.get();
	}
	*/
}
