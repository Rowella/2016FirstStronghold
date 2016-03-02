package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pot extends Subsystem {
	static int UP = 2;
	static int DOWN = -2;
    AnalogPotentiometer pot = new AnalogPotentiometer(RobotMap.POT);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public boolean isUp(){
    	if (pot.get() > UP){
    		return true;
    	} 
    	else {
    		return false;
    	}
    }
    
    public boolean isDown(){
    	if (pot.get() < DOWN) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}

