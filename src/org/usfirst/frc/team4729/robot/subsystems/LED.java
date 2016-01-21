package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.RobotMap;

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
	Timer timer = new Timer();
	static int counter = 0;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void counterReset(){
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
    public void off(){
    	ledA.set(0);
    	ledB.set(0);
    	SmartDashboard.putString("LEDS", "off");
    }
    
    public void set(double a, double b){
    	ledA.set(a);
    	ledB.set(b);
    }
}

