package org.usfirst.frc.team4729.robot.commands;

import org.usfirst.frc.team4729.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmToFloor extends Command{
	public ArmToFloor() {
		requires(Robot.frontArm);
	}

	protected void initialize() {
		
	}

	protected void execute() {
		Robot.frontArm.lower();
		
	}
	
	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.frontArm.stop();
		
	}

	protected void interrupted() {
		
		
	}

}
