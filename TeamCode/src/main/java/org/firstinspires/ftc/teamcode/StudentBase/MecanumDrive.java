package org.firstinspires.ftc.teamcode.StudentBase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Interface.DriveSystem;

/**
 * Mecanum Drive System Implementation
 * Handles 4-wheel mecanum drive calculations and motor control
 * Located in: teamcode/StudentBase/
 * This connects to MecanumRobot in RobotCode
 */
public class MecanumDrive implements DriveSystem {

    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;
    private HardwareMap hardwareMap;
    private Telemetry telemetry;

    /**
     * Constructor - initializes the mecanum drive system
     */
    public MecanumDrive(HardwareMap hardwareMap, Telemetry telemetry) {
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        initializeMotors();
    }

    /**
     * Initialize and configure the drive motors
     */
    private void initializeMotors() {
        // Get motors from hardware map
        frontLeft = hardwareMap.get(DcMotor.class, "front_left");
        frontRight = hardwareMap.get(DcMotor.class, "front_right");
        backLeft = hardwareMap.get(DcMotor.class, "back_left");
        backRight = hardwareMap.get(DcMotor.class, "back_right");

        // Set motor directions (adjust based on your robot's wiring)
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.FORWARD);

        // Set motors to brake when power is zero
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    /**
     * Drive the robot using mecanum wheel calculations
     */
    @Override
    public void drive(double forward, double strafe, double rotate) {
        // Mecanum drive math
        double frontLeftPower = forward + strafe + rotate;
        double frontRightPower = forward - strafe - rotate;
        double backLeftPower = forward - strafe + rotate;
        double backRightPower = forward + strafe - rotate;

        // Find the maximum power to normalize if needed
        double maxPower = Math.max(Math.abs(frontLeftPower),
                Math.max(Math.abs(frontRightPower),
                        Math.max(Math.abs(backLeftPower),
                                Math.abs(backRightPower))));

        // Normalize powers if any exceed 1.0
        if (maxPower > 1.0) {
            frontLeftPower /= maxPower;
            frontRightPower /= maxPower;
            backLeftPower /= maxPower;
            backRightPower /= maxPower;
        }

        // Set motor powers
        frontLeft.setPower(frontLeftPower);
        frontRight.setPower(frontRightPower);
        backLeft.setPower(backLeftPower);
        backRight.setPower(backRightPower);
    }

    /**
     * Stop all drive motors
     */
    @Override
    public void stop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    /**
     * Get telemetry data for the drive system
     */
    public void updateTelemetry() {
        telemetry.addData("FL Power", "%.2f", frontLeft.getPower());
        telemetry.addData("FR Power", "%.2f", frontRight.getPower());
        telemetry.addData("BL Power", "%.2f", backLeft.getPower());
        telemetry.addData("BR Power", "%.2f", backRight.getPower());
    }
}