package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Retention extends Subsystem {
	Servo retServo = new Servo(RobotMap.RETSERVO);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void release() {
    	retServo.set(retServo.get() + 10);
    }
    
    public void stop() {
    	retServo.set(retServo.get());
    }
}

