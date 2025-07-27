package org.firstinspires.ftc.teamcode.Interface;

/*
 * Rotational Movement Interface
 *
 * For systems that rotate around a pivot point
 * Examples: Arm joints, turrets, wrist rotation
 */
public interface RotationalMovementSystem {
    /*
     * Rotate to a specific angle
     * @param angle Target angle in degrees
     */
    void rotateToAngle(double angle);

    /*
     * Rotate with continuous power
     * @param power Power level (-1.0 to 1.0)
     */
    void setPower(double power);

    /*
     * Get current angle
     * @return Current angle in degrees
     */
    double getCurrentAngle();

    /*
     * Check if rotation is complete
     * @return true if at target angle
     */
    boolean isAtTarget();

    /*
     * Stop rotation
     */
    void stop();

    /*
     * Set angle limits for safety
     * @param minAngle Minimum allowed angle
     * @param maxAngle Maximum allowed angle
     */
    void setAngleLimits(double minAngle, double maxAngle);
}
