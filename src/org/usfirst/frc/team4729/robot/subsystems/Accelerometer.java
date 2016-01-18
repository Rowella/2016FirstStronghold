package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Accelerometer extends Subsystem {
	BuiltInAccelerometer accel = new BuiltInAccelerometer();
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public boolean isFlat(){
    	if ((accel.getX() > 1.3) || (accel.getX() < 0.7)){
    		return false;
    	}
    	else {
    		return true;
    	}
    }
}

