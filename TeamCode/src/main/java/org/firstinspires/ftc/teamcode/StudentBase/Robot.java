package org.firstinspires.ftc.teamcode.StudentBase;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Interface.DriveSystem;

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
        periodicUpdate();
    }

    /**
     * Students implement this with their robot's main logic
     */
    protected abstract void periodicUpdate();

    /**
     * Stop the robot (including drive system)
     */
    public void stop() {
        if (driveSystem != null) {
            driveSystem.stop();
        }
    }
}