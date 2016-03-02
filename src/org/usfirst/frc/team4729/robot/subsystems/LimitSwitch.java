package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LimitSwitch extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	DigitalInput switchUpper = new DigitalInput(1);
	DigitalInput switchLower = new DigitalInput(0);
	DigitalInput switchArmLower = new DigitalInput(2);
	DigitalInput switchArmUpper = new DigitalInput(3);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public boolean isUpper() {
    	return switchUpper.get();
    }
    
    public boolean isLower() {
    	return switchLower.get();
    }
    
    public boolean isArmLower() {
    	return switchArmLower.get();
    }
    
    public boolean isArmUpper() {
    	return switchArmUpper.get();
    }
}

