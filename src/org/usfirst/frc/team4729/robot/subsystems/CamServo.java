package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CamServo extends Subsystem {
	Servo camServo = new Servo(RobotMap.CAMSERVO);
	float speed = 1;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void camDown() {
    	double currentAng = camServo.getAngle();
    	camServo.setAngle(currentAng-speed);
    }
    
    public void camUp() {
    	double currentAng = camServo.getAngle();
    	camServo.setAngle(currentAng+speed);
    }
    
    public void stop() {
    	double currentAng = camServo.getAngle();
    	camServo.setAngle(currentAng);
    }
}