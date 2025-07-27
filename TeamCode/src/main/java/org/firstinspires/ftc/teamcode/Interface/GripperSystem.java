package org.firstinspires.ftc.teamcode.Interface;

/*
 * Gripper Interface
 *
 * For systems that grab and release objects
 * Examples: Claws, grippers, intake systems
 */
public interface GripperSystem {
    /*
     * Open the gripper to release objects
     */
    void open();

    /*
     * Close the gripper to grab objects
     */
    void close();

    /*
     * Toggle between open and closed
     */
    void toggle();

    /*
     * Set gripper to specific position
     * @param position Position (0.0 = fully closed, 1.0 = fully open)
     */
    void setPosition(double position);

    /*
     * Check if gripper is open
     * @return true if gripper is in open position
     */
    boolean isOpen();

    /*
     * Check if gripper is closed
     * @return true if gripper is in closed position
     */
    boolean isClosed();
}
