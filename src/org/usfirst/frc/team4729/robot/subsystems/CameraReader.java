package org.usfirst.frc.team4729.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class CameraReader extends Subsystem {
	
	NetworkTable table;
	
	
    //NetworkTable table;
    //NetworkTable blobCount;
	//float centreX = 159;
	//double[] defaultValue = new double[0];
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	table = NetworkTable.getTable("turnFin");
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public boolean checkCentre() {
    	
    	boolean fin = table.getBoolean("turnFin");
    	
    	return fin;
    	//table = NetworkTable.getTable("");
    	  	
    	//double[] coords = table.getNumberArray("BLOBS", defaultValue);
    	//if (coords[0] <= centreX) {
    	//	return true;
    	//}
    	//else {
    	//	return false;
    	
    	
    }
}

