package org.firstinspires.ftc.teamcode.Interface;

/*
 * Linear Movement Interface
 *
 * For systems that move in/out or up/down in a straight line
 * Examples: Linear slides, elevators, extending arms
 */
public interface LinearMovementSystem {
    /*
     * Extend climbing mechanism
     */
    void extend();

    /*
     * Retract climbing mechanism
     */
    void retract();

    /*
     * Stop all climbing movement
     */
    void stop();

    /*
     * Set a position compared to the set limit
     * @param power Extension length (0 to 1.0)
     */
    void setPosition(double power);

    /*
     * Get current position
     * @return Current position in configured units
     */
    double getCurrentPosition();

    /*
     * Set position limits for safety
     * @param min Minimum allowed position
     * @param max Maximum allowed position
     */
    void setLimits(double min, double max);
}
