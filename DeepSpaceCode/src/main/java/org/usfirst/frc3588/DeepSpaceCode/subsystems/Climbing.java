// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3588.DeepSpaceCode.subsystems;


import org.usfirst.frc3588.DeepSpaceCode.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Climbing extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private DoubleSolenoid doublePistonsSolenoid;
    private DoubleSolenoid singlePistonSolenoid;
    private WPI_TalonSRX pistonMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Climbing() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        doublePistonsSolenoid = new DoubleSolenoid(0, 0, 1);
        addChild("DoublePistonsSolenoid",doublePistonsSolenoid);
        
        
        singlePistonSolenoid = new DoubleSolenoid(0, 2, 3);
        addChild("SinglePistonSolenoid",singlePistonSolenoid);
        
        
        pistonMotor = new WPI_TalonSRX(0);
        
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // singlePistonSolenoid.set(DoubleSolenoid.Value.kOff);
        // doublePistonsSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    // public void extendSinglePiston(){
    //     singlePistonSolenoid.set(DoubleSolenoid.Value.kForward);
    // }
    
    // public void extendDoublePistons(){
    //     doublePistonsSolenoid.set(DoubleSolenoid.Value.kForward);
    // }
    // public void retractSinglePiston(){
    //     singlePistonSolenoid.set(DoubleSolenoid.Value.kReverse);
    // }
    // public void retractDoublePistons(){
    //     doublePistonsSolenoid.set(DoubleSolenoid.Value.kReverse);
    // }
    // public void turnOffDoublePistonSolenoid(){
    //     doublePistonsSolenoid.set(DoubleSolenoid.Value.kOff);
    // }
    // public void turnOffSinglePistonSolenoid(){
    //     singlePistonSolenoid.set(DoubleSolenoid.Value.kOff);
    // }
    // public void powerPistonMotor(double power){
    //     pistonMotor.set(power);
    // }
}

