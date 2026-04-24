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


}
