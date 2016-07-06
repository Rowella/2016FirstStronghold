package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.Robot;
import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LED extends Subsystem {
	Victor ledA = new Victor(RobotMap.LED_A);
	Victor ledB = new Victor(RobotMap.LED_B);
	Victor ledC = new Victor(RobotMap.LED_C);
	
	double av;

	//double leftSpeed = Robot.driveSubsystem.leftMotor.get();   //leftMotor.get();
	//double rightSpeed = Robot.driveSubsystem.rightMotor.get();  //rightMotor.get();
	
	//Timer timer = new Timer();
	public boolean lEDOn = true;
	static int counter = 0; 
	
//	public boolean lEDswitch  = 0;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
     
/*	public void lEDOn() {
		lEDOn = true;
	}
	
	public void LEDOff() {
		lEDOn = false;
	}
	*/
/*    public void counterReset(){
    	counter = 0;
    }
    
    public void cycleForward(){
    	counter++;
    	if (counter > 90) {
    		counter = 0;
    	}
    	SmartDashboard.putString("LEDS", "On");
    	if (counter <= 10){
    		ledA.set(0);
    		ledB.set(counter/10);
    	} else if (counter <= 20){
    		ledA.set((counter-10)/10);
    		ledB.set(1);
    	} else if (counter <= 40){
    		ledA.set(1);
    		ledB.set(1-(counter-20)/10);
    	} else if (counter <= 60){
    		ledA.set(1-(counter-40)/10);
    		ledB.set(-1);
    	} else if (counter <= 80){
    		ledA.set(-1);
    		ledB.set(-1+(counter-60)/10);
    	} else if (counter <= 90){
    		ledA.set(-1+(counter-80)/10);
    		ledB.set(1-(counter-80)/10);
    	}

    }
    */
    
    
 /*   public void Alliance() {
    	if (lEDswitch == 1) {
    		lEDSwitch
    	}
    }
  */  
 
	/*
	 * 
      public void off(){
      	ledA.set(0);
    	ledB.set(0);
    	SmartDashboard.putString("LEDS", "off");
    }
    */
    
    public void set(double r, double g, double b){
    	ledA.set(r);
    	ledB.set(g);
    	ledC.set(b);
    } 
    
    public void doppler(double leftSpeed, double rightSpeed) {
    	av = (leftSpeed+rightSpeed)/2;
    	
    	if (av >= 0) {
    		ledA.set(1);
        	ledB.set(1 - av);
        	ledC.set(1 - av);  
    	}
    	
    	else {
    		ledA.set(1 + av);
        	ledB.set(1 + av);
        	ledC.set(1);
    	}
    	
    	//ledA.set((leftSpeed+rightSpeed)/2);
    	//ledB.set(1);
    	
    	//Robot.tomahawk.up();
    	
    }
    
    public void warning() {
    	
    }
    
    
}

