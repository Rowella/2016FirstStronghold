package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Accelerometer extends Subsystem {
	BuiltInAccelerometer accel = new BuiltInAccelerometer();
    double x;
    double y;
    double startAngle;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setFlat(){
    	x = accel.getX();
    	y = accel.getY();
    	startAngle = Math.atan2(y, x);
    }
    
    public boolean isFlat(){
    	x = accel.getX();
    	y = accel.getY();
    	double angle = Math.atan2(y, x);
    	SmartDashboard.putNumber("angle", angle);
    	SmartDashboard.putNumber("startAngle", startAngle);
    	if ((angle < startAngle -0.6) || (angle > startAngle + 0.6)){
    		return false;
    	}
    	else {
    		return true;
    	}
    }
}

