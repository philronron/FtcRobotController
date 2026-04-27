package org.firstinspires.ftc.teamcode.Interface;

/*
 * Launcher Interface
 *
 * For systems that shoot or launch game elements
 * Examples: Flywheel shooters, catapults, punchers
 */
public interface LauncherSystem {
    /*
     * Fire/launch a single shot
     */
    void motorStart();

    /*
     * Start continuous firing
     */
    void motorStop();

    /*
     * Set launch power/speed
     * @param power Power level (0.0 to 1.0)
     */
    void setPower(double power);
}
