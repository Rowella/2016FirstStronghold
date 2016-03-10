package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class CameraReader extends Subsystem {
    NetworkTable table;
	float centre = 159;
	double[] defaultValue = new double[0];
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public boolean checkCentre() {
    	table = NetworkTable.getTable("BLOBS");
    	double[] coords = table.getNumberArray("BLOBS", defaultValue);
    	if (coords[0] <= centre) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}

