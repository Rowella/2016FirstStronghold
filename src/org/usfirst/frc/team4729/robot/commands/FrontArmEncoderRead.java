package org.usfirst.frc.team4729.robot.commands;

import org.usfirst.frc.team4729.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FrontArmEncoderRead extends Command{
	public FrontArmEncoderRead(){
		requires(Robot.frontArm);
	}
	
	protected void initialize() {
		
		
	}

	
	protected void execute() {
		Robot.frontArm.readFrontArmEncoder();
		
	}


	protected boolean isFinished() {
		return false;
	}

	
	protected void end() {
			
	}


	protected void interrupted() {
		
	}
	
}
