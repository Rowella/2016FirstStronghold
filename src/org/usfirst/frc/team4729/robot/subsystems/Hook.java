package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Hook extends Subsystem {
	
	public boolean ready = false;
	
	Talon piston = new Talon(RobotMap.PISTON_MOTOR);
	Talon winch = new Talon(RobotMap.WINCH_MOTOR);
	
	DoubleSolenoid solenoid = new DoubleSolenoid(RobotMap.SOLENOID_A, RobotMap.SOLENOID_B);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void safetyOn() {
    	ready = true;
    }
    
    public void safetyOff() {
    	ready = false;
    }
    
    public void pistonUp() {
    	piston.set(1);
    }
    
    public void pistonStop() {
    	piston.set(0);
    }
    
    public void winchIn() {
    	winch.set(1);
    }
    
    public void winchStop() {
    	winch.set(0);
    }
    
    public void fire() {
    	solenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    
    
}

