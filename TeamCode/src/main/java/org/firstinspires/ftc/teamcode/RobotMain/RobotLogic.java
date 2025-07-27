package org.firstinspires.ftc.teamcode.RobotMain;
import org.firstinspires.ftc.teamcode.StudentBase.MecanumDrive;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class RobotLogic extends Robot {

    private MecanumDrive mecanumDrive;

    public RobotLogic(HardwareMap hardwareMap, Telemetry telemetry, Gamepad gamepad1, Gamepad gamepad2) {
        super(hardwareMap, telemetry, gamepad1, gamepad2);
    }


    /*
     * Initilise your robot here
     *
     * you need to create a new system for every part that needs a movement.
     * this will allow for multiple systems to be their own object to be manipulated
     * for TeleOp or Autonomous
     */
    @Override
    protected void initializeRobot() {
        // Create the mecanum drive system
        mecanumDrive = new MecanumDrive(hardwareMap, telemetry);
        driveSystem = mecanumDrive; // Set the drive system in case there is more than 1 type of drive
    }

    /*
     * This is where you place the movement logic
     * that gets passed to the Robot class in RobotMain.
     *
     * Place the inputs into here and pass that to the appropriate class you create in
     * the student base.
     */
    @Override
    protected void MovementUpdate() {

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