package org.firstinspires.ftc.teamcode.Interface;

/*
 * Linear Movement Interface
 *
 * For systems that move in/out or up/down in a straight line
 * Examples: Linear slides, elevators, extending arms
 */
public interface LinearMovementSystem {
    /*
     * Move to a specific position
     * @param position Target position (encoder counts, inches, etc.)
     */
    void moveToPosition(double position);

    /*
     * Move with continuous power
     * @param power Power level (-1.0 to 1.0)
     */
    void setPower(double power);

    /*
     * Get current position
     * @return Current position in configured units
     */
    double getCurrentPosition();

    /*
     * Check if movement is complete
     * @return true if at target position
     */
    boolean isAtTarget();

    /*
     * Stop all movement
     */
    void stop();

    /*
     * Set position limits for safety
     * @param min Minimum allowed position
     * @param max Maximum allowed position
     */
    void setLimits(double min, double max);
}
