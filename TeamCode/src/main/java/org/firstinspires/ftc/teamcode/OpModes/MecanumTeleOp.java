package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.RobotCode.MecanumRobot;


/**
 * DO NOT EDIT!
 * WILL BREAK YOU'RE CODE IF YOU EDIT THIS!
 *
 * Fall back to your last iteration if you break the code updating this.
 */
@TeleOp(name = "Mecanum Drive", group = "Student")
public class MecanumTeleOp extends OpMode {

    private MecanumRobot robot;

    @Override
    public void init() {
        robot = new MecanumRobot(hardwareMap, telemetry, gamepad1, gamepad2);
        telemetry.addData("Status", "Robot Initialized");
        telemetry.update();
    }

    @Override
    public void loop() {
        robot.update();
    }

    @Override
    public void stop() {
        robot.stop();
    }
}
