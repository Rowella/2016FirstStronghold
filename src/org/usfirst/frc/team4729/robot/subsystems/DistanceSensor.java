package org.usfirst.frc.team4729.robot.subsystems;


import org.usfirst.frc.team4729.robot.Robot;
import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DistanceSensor extends Subsystem {
	 AnalogInput distanceSensor = new AnalogInput(RobotMap.DISTANCE_SENSOR);
   
   // Put methods for controlling this subsystem
   // here. Call these from Commands.

   public void initDefaultCommand() {
       // Set the default command for a subsystem here.
       //setDefaultCommand(new MySpecialCommand());
   }
   
   public void senseDistance(){
   	double distance = distanceSensor.getVoltage();
   	SmartDashboard.putNumber("Distance", distance);
   	if (Robot.lEDMovement == false){
   		if (distance > 1.8) {
   			Robot.lED.set(0, -1);
   		}
   		else if(distance > 1.5) {
   			Robot.lED.set(-1, 1);
   		}
   		else if(distance > 1) {
   			Robot.lED.set(-1, 0);
   		}
   		else {
   			Robot.lED.set(1, 1);
   		}
   	}
   }
}
