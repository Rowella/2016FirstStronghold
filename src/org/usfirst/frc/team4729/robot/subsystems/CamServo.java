package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.Robot;
import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CamServo extends Subsystem {
	Servo camServo = new Servo(RobotMap.CAMSERVO);
	float speed = 5;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void autoAngle() {
    	double currentAng = camServo.getAngle();
    	while (currentAng >= 35) {
    		camServo.setAngle(currentAng-speed);
    	}
    }
    
    public void camDown() {
    	double currentAng = camServo.getAngle();
    	camServo.setAngle((currentAng+speed)*Robot.speedSubsystem.universalSpeed);
    }
    
    public void camUp() {
    	double currentAng = camServo.getAngle();
    	camServo.setAngle((currentAng-speed)*Robot.speedSubsystem.universalSpeed);
    }
    
    public void stop() {
    	double currentAng = camServo.getAngle();
    	camServo.setAngle(currentAng);
    }
}