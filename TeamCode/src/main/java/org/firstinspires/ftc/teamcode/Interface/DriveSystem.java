package org.firstinspires.ftc.teamcode.Interface;

/*
 * Drive System Interface
 *
 * Defines the contract for all drive systems (mecanum, tank, swerve, etc.)
 * Located in: teamcode/interfaces/
 */
public interface DriveSystem {

    /*
     * Drive the robot with given inputs
     * @param forward Forward/backward movement (-1.0 to 1.0)
     * @param strafe Left/right movement (-1.0 to 1.0)
     * @param rotate Rotation (-1.0 to 1.0)
     */
    void drive(double forward, double strafe, double rotate);

    /*
     * Stop all drive motors
     */
    void stop();
}
