package org.usfirst.frc.team4729.robot.commands;

import org.usfirst.frc.team4729.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmChange extends Command{
	static boolean goingUp = true;
	public ArmChange() {
		requires(Robot.frontArm);
	}

	protected void initialize() {
		
	}

	protected void execute() {
			if (goingUp){
				Robot.frontArm.raise();
			}
			else {
				Robot.frontArm.lower();
			}
	}
	
	protected boolean isFinished() {
    	if (goingUp) {
    		if (Robot.pot.isUp()) {
    			goingUp = false;
    			return true;
    		}
    		else {
    		    return false;	
    		}
        } 
    	else {
        	if (Robot.pot.isDown()) {
        		goingUp = true;
        		return true;
        	}
        	else {
        		return false;
        	}
        }
    }

	protected void end() {
		Robot.frontArm.stop();
		
	}

	protected void interrupted() {
		Robot.frontArm.stop();
		
	}

}
