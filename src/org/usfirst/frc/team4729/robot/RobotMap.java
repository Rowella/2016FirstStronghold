package org.usfirst.frc.team4729.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//motor controllers
	public static int RIGHT_MOTOR = 0;
	public static int LEFT_MOTOR = 1;
	public static int TOMAHAWK_MOTOR = 2;
//	public static int FRONT_ARM_MOTOR = 3;
//	public static int CLIMBER_MOTOR = 4;
//	public static int MEASURING_TAPE_MOTOR = 5;
	public static int LED_A = 7;
	public static int SHOOTER_MOTOR = 8;
	public static int LED_B = 9;
//	public static int CAMSERVO = 9;
	
	public static int WINCH_MOTOR = 3;
	public static int PISTON_MOTOR = 4;
	
	//PCM outputs
	public static int SOLENOID_A = 0;
	public static int SOLENOID_B = 1;
		
	//public static int LIFT_MOTOR = ;
	
	// digital inputs
	public static int LIMIT_SWITCH_LOWER = 0;
	public static int LIMIT_SWITCH_UPPER = 1;
	
	//analog inputs
//	public static int POT = 0;
	//public static int DISTANCE_SENSOR = 1;
	
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
