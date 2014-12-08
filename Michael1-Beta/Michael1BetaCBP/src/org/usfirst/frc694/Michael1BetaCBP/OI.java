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

import org.usfirst.frc694.Michael1BetaCBP.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton paddleOutButton;
    public JoystickButton shooterInButton;
    public JoystickButton shooterVomitButton;
    public JoystickButton acquirerOutButton;
    public JoystickButton acquireInButton;
    public Joystick shooterStick;
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(1);
        
        leftJoystick = new Joystick(0);
        
        shooterStick = new Joystick(2);
        
        acquireInButton = new JoystickButton(shooterStick, 1);
        acquireInButton.whileHeld(new AcquirerIn());
        acquirerOutButton = new JoystickButton(shooterStick, 2);
        acquirerOutButton.whileHeld(new AcquirerOut());
        shooterVomitButton = new JoystickButton(shooterStick, 1);
        shooterVomitButton.whileHeld(new ShooterIn());
        shooterInButton = new JoystickButton(shooterStick, 1);
        shooterInButton.whileHeld(new ShooterIn());
        paddleOutButton = new JoystickButton(shooterStick, 1);
        paddleOutButton.whileHeld(new PaddleOut());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("Acquirer In", new AcquirerIn());

        SmartDashboard.putData("Acquirer Out", new AcquirerOut());

        SmartDashboard.putData("Acquirer Stop", new AcquirerStop());

        SmartDashboard.putData("Shooter Vomit", new ShooterVomit());

        SmartDashboard.putData("Shooter In", new ShooterIn());

        SmartDashboard.putData("Shooter Stop", new ShooterStop());

        SmartDashboard.putData("Paddle Out", new PaddleOut());

        SmartDashboard.putData("Paddle In", new PaddleIn());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getShooterStick() {
        return shooterStick;
    }

    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

