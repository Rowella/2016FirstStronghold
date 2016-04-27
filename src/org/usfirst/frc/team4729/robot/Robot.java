
package org.usfirst.frc.team4729.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team4729.robot.commands.AutoCommand;
import org.usfirst.frc.team4729.robot.commands.AutoTurn;
import org.usfirst.frc.team4729.robot.commands.CameraAuto1;
import org.usfirst.frc.team4729.robot.commands.CameraTime1;
import org.usfirst.frc.team4729.robot.commands.DudAuto;
import org.usfirst.frc.team4729.robot.commands.LEDCycle;
import org.usfirst.frc.team4729.robot.commands.LEDMovement;
import org.usfirst.frc.team4729.robot.commands.StartUpSpeed;
import org.usfirst.frc.team4729.robot.commands.TwoStickArcade;
import org.usfirst.frc.team4729.robot.commands.TwoStickTank;
import org.usfirst.frc.team4729.robot.subsystems.Accelerometer;
import org.usfirst.frc.team4729.robot.subsystems.CamServo;
import org.usfirst.frc.team4729.robot.subsystems.CameraReader;
import org.usfirst.frc.team4729.robot.subsystems.Climber;
import org.usfirst.frc.team4729.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team4729.robot.subsystems.FrontArm;
import org.usfirst.frc.team4729.robot.subsystems.LED;
import org.usfirst.frc.team4729.robot.subsystems.LimitSwitch;
import org.usfirst.frc.team4729.robot.subsystems.Pot;
import org.usfirst.frc.team4729.robot.subsystems.Shooter;
import org.usfirst.frc.team4729.robot.subsystems.SpeedSubsystem;
import org.usfirst.frc.team4729.robot.subsystems.Tomahawk;
import org.usfirst.frc.team4729.robot.subsystems.Winch;
import org.usfirst.frc.team4729.robot.commands.ExampleCommand;
import org.usfirst.frc.team4729.robot.commands.GoalAutonomous;
import org.usfirst.frc.team4729.robot.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static DriveSubsystem driveSubsystem;
	public static Accelerometer accelerometer;
	public static OI oi;
	public static Shooter shooter;
	public static Climber climber;
	public static FrontArm frontArm;
	public static LED lED;
	public static boolean lEDMovement;
	public static Tomahawk tomahawk;
	public static Winch winch;
	public static LimitSwitch limitSwitch;
	public static Pot pot;
	public static CamServo camServo;
	public static CameraReader cameraReader;
	public static SpeedSubsystem speedSubsystem;
    Command autonomousCommand;


    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	lEDMovement = false;
    	driveSubsystem = new DriveSubsystem();
    	accelerometer = new Accelerometer();
		shooter = new Shooter();
		climber = new Climber();
		frontArm = new FrontArm();
		lED = new LED();
		autonomousCommand = new DudAuto();
		oi = new OI();
		tomahawk = new Tomahawk();
		winch = new Winch();
		limitSwitch = new LimitSwitch();
		camServo = new CamServo();
		cameraReader = new CameraReader();
		speedSubsystem = new SpeedSubsystem();
		
		
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}


    public void autonomousInit() {
    	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        Joystick leftStick = new Joystick(0);
        Joystick rightStick = new Joystick(1);
        Robot.speedSubsystem.universalSpeed = 1;
        Robot.driveSubsystem.speed = 1;
        Robot.driveSubsystem.acceleration = 0.5;
        Robot.lED.set(1,-1);
        TwoStickTank twoStickTank = new TwoStickTank(leftStick, rightStick);
        twoStickTank.start();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
