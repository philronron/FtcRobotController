package org.firstinspires.ftc.teamcode.RobotMain;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Interface.ClimbingSystem;
import org.firstinspires.ftc.teamcode.Interface.DriveSystem;
import org.firstinspires.ftc.teamcode.Interface.GripperSystem;
import org.firstinspires.ftc.teamcode.Interface.IntakeSystem;
import org.firstinspires.ftc.teamcode.Interface.LauncherSystem;
import org.firstinspires.ftc.teamcode.Interface.LinearMovementSystem;
import org.firstinspires.ftc.teamcode.Interface.RotationalMovementSystem;
import org.firstinspires.ftc.teamcode.Interface.SensorSystem;

/**
*
 * Basic Robot Abstract Class with Drive System Support
 *
 * Now includes support for drive systems
 * Located in: teamcode/base/
 *
 */

/**

* IMPORTANT NOTES!
*
* DO NOT EDIT THIS CLASS!
*
* EDITING THIS CLASS CAN BREAK YOUR CODE!
*
* If you edit this and break the code, fallback to your last iteration on git.
*/
public abstract class Robot {

    // Core FTC components
    protected HardwareMap hardwareMap;
    protected Telemetry telemetry;
    protected Gamepad gamepad1;
    protected Gamepad gamepad2;

    // Drive system - students can use any DriveSystem implementation
    protected DriveSystem driveSystem;
    protected ClimbingSystem climbingSystem;
    protected GripperSystem gripperSystem;
    protected IntakeSystem intakeSystem;
    protected LauncherSystem launcherSystem;
    protected LinearMovementSystem linearMovementSystem;
    protected RotationalMovementSystem rotationalMovementSystem;
    protected SensorSystem sensorSystem;
    /**
     * Constructor - Sets up the robot with FTC hardware
     */
    public Robot(HardwareMap hardwareMap, Telemetry telemetry, Gamepad gamepad1, Gamepad gamepad2) {
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;
        this.gamepad1 = gamepad1;
        this.gamepad2 = gamepad2;

        // Initialize the robot
        initializeRobot();
    }

    /**
     * Students implement this to set up their robot hardware
     */
    protected abstract void initializeRobot();

    /**
     * Main update method - called every loop cycle
     */
    public void update() {
        MovementUpdate();
    }

    /**
     * Students implement this with their robot's main logic
     */
    protected abstract void MovementUpdate();

    /**
     * Stop the robot (including drive system)
     */
    public void stop() {
        if (driveSystem != null) {
            driveSystem.stop();
        }
    }
}