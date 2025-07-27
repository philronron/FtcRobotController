package org.firstinspires.ftc.teamcode.Interface;

/*
 * Climbing System Interface
 *
 * For end-game climbing mechanisms
 * Examples: Hooks, winches, extending climbers
 */
public interface ClimbingSystem {
    /*
     * Extend climbing mechanism
     */
    void extend();

    /*
     * Retract climbing mechanism
     */
    void retract();

    /*
     * Start climbing sequence
     */
    void startClimb();

    /*
     * Stop all climbing movement
     */
    void stop();

    /*
     * Check if robot is attached to climbing structure
     * @return true if attached and ready to climb
     */
    boolean isAttached();

    /*
     * Check if climbing is complete
     * @return true if successfully climbed
     */
    boolean isClimbComplete();
}

