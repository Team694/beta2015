// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc694.Michael1BetaCBP;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Servo paddleServoPaddle;
    public static SpeedController acquirerAcquirerMotorControllerBottom;
    public static SpeedController acquirerAcquirerMotorControllerTop;
    public static SpeedController drivetrainLeftMotorController;
    public static SpeedController drivetrainRightMotorController;
    public static RobotDrive drivetrainRobotDrive;
    public static Relay shooterShooterSpike;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        paddleServoPaddle = new Servo(4);
        LiveWindow.addActuator("Paddle", "Servo Paddle", paddleServoPaddle);
        
        acquirerAcquirerMotorControllerBottom = new Talon(Constants.ACQUIRER_BOTTOM_ROLLER);
        LiveWindow.addActuator("Acquirer", "Acquirer Motor Controller Bottom", (Talon) acquirerAcquirerMotorControllerBottom);
        
        acquirerAcquirerMotorControllerTop = new Talon(Constants.ACQUIRER_TOP_ROLLER);
        LiveWindow.addActuator("Acquirer", "Acquirer Motor Controller Top", (Talon) acquirerAcquirerMotorControllerTop);
        
        drivetrainLeftMotorController = new Victor(Constants.DRIVETRAIN_LEFT_CHANNEL);
        //LiveWindow.addActuator("Drivetrain", "Left Motor Controller", (VictorSP) drivetrainLeftMotorController);
        
        drivetrainRightMotorController = new Victor(Constants.DRIVETRAIN_RIGHT_CHANNEL);
        //LiveWindow.addActuator("Drivetrain", "Right Motor Controller", (VictorSP) drivetrainRightMotorController);
        
        drivetrainRobotDrive = new RobotDrive(drivetrainLeftMotorController, drivetrainRightMotorController);
        
        drivetrainRobotDrive.setSafetyEnabled(false);
        drivetrainRobotDrive.setExpiration(0.1);
        drivetrainRobotDrive.setSensitivity(0.5);
        drivetrainRobotDrive.setMaxOutput(1.0);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);        
        shooterShooterSpike = new Relay(0);
        LiveWindow.addActuator("Shooter", "Shooter Spike", shooterShooterSpike);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
