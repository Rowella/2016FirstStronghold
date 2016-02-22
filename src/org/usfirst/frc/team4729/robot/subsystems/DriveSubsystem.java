package org.usfirst.frc.team4729.robot.subsystems;

import org.usfirst.frc.team4729.robot.Robot;
import org.usfirst.frc.team4729.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
//import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */

public class DriveSubsystem extends Subsystem {
	RobotDrive driveTrain = new RobotDrive(RobotMap.LEFT_MOTOR, RobotMap.RIGHT_MOTOR);
	/**double kP = 1;
	double kI = 1;
	double kD = 1;
	Talon leftMotor = new Talon(RobotMap.LEFT_MOTOR);
	Talon rightMotor = new Talon(RobotMap.RIGHT_MOTOR);
	Encoder leftEncoder = new Encoder(5, 6);
	Encoder rightEncoder = new Encoder (2, 3);
	PIDController leftPID = new PIDController(kP, kI, kD, leftEncoder, leftMotor);
	PIDController rightPID = new PIDController(kP, kI, kD, rightEncoder, rightMotor);*/
	
	
	double leftSpeed = 0;
	double rightSpeed = 0;
	double turnSpeed = 0;
	double forwardSpeed = 0;
	
	double acceleration = 0.05;
	double speed = 1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	/**leftEncoder.setPIDSourceType(PIDSourceType.kRate);
    	rightEncoder.setPIDSourceType(PIDSourceType.kRate);
    	rightPID.enable();
    	leftPID.enable();*/
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void arcade(double desiredMove, double desiredTurn) {
    	double desiredLeft = desiredMove - desiredTurn;
    	double desiredRight = desiredMove + desiredTurn;
    	if ((desiredLeft < 0.1) && (desiredLeft > -0.1)){
    		desiredLeft = 0;
    		leftSpeed = 0;
    	}
    	if ((desiredRight < 0.1) && (desiredRight > -0.1)){
    		desiredRight = 0;
    		rightSpeed = 0;
    	}
    	
    	if  (((desiredLeft > 0) && (leftSpeed < 0)) || ((desiredLeft < 0) && (leftSpeed > 0))){
    		leftSpeed = 0;
    	}
    	if (((desiredRight > 0) && (rightSpeed < 0)) || ((desiredRight < 0) && (rightSpeed > 0))){
    		rightSpeed = 0;
    	}
    	
    	if (Math.abs(desiredLeft) < Math.abs(leftSpeed)){
    		leftSpeed = desiredLeft;
    	}
    	
    	if (Math.abs(desiredRight) < Math.abs(rightSpeed)) {
    		rightSpeed = desiredRight;
    	}
    	
    	rightSpeed += (desiredRight-rightSpeed)*acceleration;
    	leftSpeed += (desiredLeft-leftSpeed)*acceleration;
    	
    	/**leftPID.setSetpoint(leftSpeed);
    	rightPID.setSetpoint(rightSpeed);*/
    	/*if (Robot.lEDMovement == true){
    		Robot.lED.set(-leftSpeed*speed, -rightSpeed*speed);
    	} */
    	driveTrain.arcadeDrive(desiredMove * 0.5, desiredTurn * 0.5);
    	//driveTrain.arcadeDrive(forwardSpeed*speed, turnSpeed*speed);
    }
    
    
    
    public void tank (double desiredLeft, double desiredRight) {
    	if ((desiredLeft < 0.1) && (desiredLeft > -0.1)){
    		desiredLeft = 0;
    		leftSpeed = 0;
    	}
    	if ((desiredRight < 0.1) && (desiredRight > -0.1)){
    		desiredRight = 0;
    		rightSpeed = 0;
    	}
    	
    	if  (((desiredLeft > 0) && (leftSpeed < 0)) || ((desiredLeft < 0) && (leftSpeed > 0))){
    		leftSpeed = 0;
    	}
    	if (((desiredRight > 0) && (rightSpeed < 0)) || ((desiredRight < 0) && (rightSpeed > 0))){
    		rightSpeed = 0;
    	}
    	
    	if (Math.abs(desiredLeft) < Math.abs(leftSpeed)){
    		leftSpeed = desiredLeft;
    	}
    	
    	if (Math.abs(desiredRight) < Math.abs(rightSpeed)) {
    		rightSpeed = desiredRight;
    	}
    	rightSpeed += (desiredRight-rightSpeed)*acceleration;
    	leftSpeed += (desiredLeft-leftSpeed)*acceleration;
    	/**leftPID.setSetpoint(leftSpeed);
    	rightPID.setSetpoint(rightSpeed);*/
 /*   	if (Robot.lEDMovement == true){
    		Robot.lED.set(-leftSpeed*speed, -rightSpeed*speed);
    	} */
    	driveTrain.tankDrive(leftSpeed*speed, rightSpeed*speed);
	}
    
}

