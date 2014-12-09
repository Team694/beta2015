// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc694.Michael1BetaCBP.subsystems;
import org.usfirst.frc694.Michael1BetaCBP.RobotMap;
import org.usfirst.frc694.Michael1BetaCBP.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Acquirer extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController acquirerMotorControllerBottom = RobotMap.acquirerAcquirerMotorControllerBottom;
    SpeedController acquirerMotorControllerTop = RobotMap.acquirerAcquirerMotorControllerTop;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new AcquirerStop());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void acquire() {
    	acquirerMotorControllerTop.set(1);
    	acquirerMotorControllerBottom.set(-1);
    }
    
    public void acquirerReverse() {
    	acquirerMotorControllerTop.set(-1);
    	acquirerMotorControllerBottom.set(1);
    }
    
    public void setRollers(double value) {
    	acquirerMotorControllerTop.set(value);
    	acquirerMotorControllerBottom.set(-value);
    }
    
    public double getRollerSpeed() {
    	return acquirerMotorControllerTop.get();
    }
    
    public void stop() {
    	acquirerMotorControllerTop.set(0);
    	acquirerMotorControllerBottom.set(0);
    }
    
}
