package org.firstinspires.ftc.teamcode.RobotCode;
import org.firstinspires.ftc.teamcode.StudentBase.Robot;
import org.firstinspires.ftc.teamcode.StudentBase.MecanumDrive;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class MecanumRobot extends Robot {

    private MecanumDrive mecanumDrive;

    public MecanumRobot(HardwareMap hardwareMap, Telemetry telemetry, Gamepad gamepad1, Gamepad gamepad2) {
        super(hardwareMap, telemetry, gamepad1, gamepad2);
    }

    @Override
    protected void initializeRobot() {
        // Create the mecanum drive system
        mecanumDrive = new MecanumDrive(hardwareMap, telemetry);
        driveSystem = mecanumDrive; // Set the drive system
    }

    @Override
    protected void periodicUpdate() {

        // Get gamepad inputs
        double forward = -gamepad1.left_stick_y;  // Forward/backward
        double strafe = gamepad1.left_stick_x;    // Left/right
        double rotate = gamepad1.right_stick_x;   // Rotation

        // Drive the robot
        driveSystem.drive(forward, strafe, rotate);

        // Update telemetry
        mecanumDrive.updateTelemetry();
        telemetry.addData("Forward", "%.2f", forward);
        telemetry.addData("Strafe", "%.2f", strafe);
        telemetry.addData("Rotate", "%.2f", rotate);
        telemetry.update();
    }
}