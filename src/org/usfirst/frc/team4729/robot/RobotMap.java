package org.usfirst.frc.team4729.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//motor controllers
	public static int LEFT_MOTOR = 0;
	public static int RIGHT_MOTOR = 1;
	public static int SHOOTER_MOTOR = 2;
	public static int CLIMBER_MOTOR = 3;
	public static int MEASURING_TAPE_MOTOR = 4;
	public static int LED_A = 5;
	public static int LED_B = 6;
	
	//analog inputs
	public static int DISTANCE_SENSOR = 1;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
