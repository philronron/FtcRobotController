package org.firstinspires.ftc.teamcode.Interface;

/*
 * Intake System Interface
 *
 * For systems that collect game elements
 * Examples: Roller intakes, conveyor belts, vacuum systems
 */
public interface IntakeSystem {
    /*
     * Start intake to collect objects
     */
    void startIntake();

    /*
     * Start outtake to eject objects
     */
    void startOuttake();

    /*
     * Stop intake/outtake
     */
    void stop();

    /*
     * Set intake power manually
     * @param power Power level (-1.0 to 1.0, negative = outtake)
     */
    void setPower(double power);

    /*
     * Check if intake is running
     * @return true if intake is active
     */
    boolean isIntaking();

    /*
     * Check if outtake is running
     * @return true if outtake is active
     */
    boolean isOuttaking();
}

