package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
/*public class MecanumDrive extends Subsystem {
	double total;
	
	double fLWheel = 0;
	double fRWheel = 0;
	double bLWheel = 0;
	double bRWheel = 0;
	double currentXMove = 0;
	double currentYMove = 0;
	double currentTurn = 0;
	double mecAccel = 0;
	double mecSpeed = 0;
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void mecanumUnalign(double desiredTurn, double desiredYMove, double desiredXMove) {
    	currentYMove = -(fLWheel + fRWheel + bLWheel + bRWheel);
    	currentXMove = -(fLWheel - bLWheel + fRWheel - bRWheel);
    	currentTurn = fLWheel + bLWheel -(fRWheel + bRWheel);
    	
    	if ((0 < desiredTurn && desiredTurn < currentTurn) || (0 > desiredTurn && desiredTurn > currentTurn)) {
    		currentTurn = desiredTurn;
    	}
    	
    	if ((0 < desiredXMove && desiredXMove < currentXMove) || (0 > desiredXMove && desiredXMove > currentXMove)) {
    		currentTurn = desiredTurn;
    	}
    	
    	if ((0 < desiredYMove && desiredYMove < currentYMove) || (0 > desiredYMove && desiredYMove > currentYMove)) {
    		currentTurn = desiredTurn;
    	}
    	
    	currentXMove += (desiredXMove - currentXMove)*mecAccel;
    	currentYMove += (desiredYMove - currentYMove)*mecAccel;
    	currentTurn += (desiredTurn - currentTurn)*mecAccel;
    	
    	
    	total = Math.abs(currentXMove) + Math.abs(currentYMove) + Math.abs(currentTurn);
    	if (total > 1) {
    		currentXMove = currentXMove/total;
    		currentYMove = currentYMove/total;
    		currentTurn = currentTurn/total;
    		
    	}
    	
    	fLWheel = -currentXMove - currentYMove + currentTurn;
    	fRWheel = -currentXMove - currentYMove - currentTurn;
    	bLWheel = currentXMove - currentYMove + currentTurn;
    	bRWheel = currentXMove - currentYMove - currentTurn;
    	
    	fLMotor.set(fLWheel);
    	fRMotor.set(fRWheel);
    	bLMotor.set(bLWheel);
    	bRMotor.set(bRWheel);
    	
    }
    
    public void mecanumAlign(double desiredTurn, double desiredXMove, double desiredYMove) {
    	currentYMove = -(fLWheel + fRWheel + bLWheel + bRWheel);
    	currentXMove = -(fLWheel - bLWheel + fRWheel - bRWheel);
    	currentTurn = fLWheel + bLWheel -(fRWheel + bRWheel);
    	
    	if ((0 < desiredTurn && desiredTurn < currentTurn) || (0 > desiredTurn && desiredTurn > currentTurn)) {
    		currentTurn = desiredTurn;
    	}
    	
    	if ((0 < desiredXMove && desiredXMove < currentXMove) || (0 > desiredXMove && desiredXMove > currentXMove)) {
    		currentTurn = desiredTurn;
    	}
    	
    	if ((0 < desiredYMove && desiredYMove < currentYMove) || (0 > desiredYMove && desiredYMove > currentYMove)) {
    		currentTurn = desiredTurn;
    	}
    	
    	double angle = gyro.getAngle();
    	if (angle > 360) {
    		angle = angle - (360*(angle%360));
    	}
    	if (angle < 0) {
    		angle = angle + (360*(angle%360));
    	}
    	
    	
    	
    	
    	currentXMove += (desiredXMove - currentXMove)*mecAccel;
    	currentYMove += (desiredYMove - currentYMove)*mecAccel;
    	currentTurn += (desiredTurn - currentTurn)*mecAccel;
    	
    	
    }
}

*/