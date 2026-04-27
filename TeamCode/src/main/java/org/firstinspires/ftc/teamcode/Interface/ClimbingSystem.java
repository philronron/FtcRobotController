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
     * Stop all climbing movement
     */
    void stop();
}

