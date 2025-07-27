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
    void fire();

    /*
     * Start continuous firing
     */
    void startContinuousFire();

    /*
     * Stop firing
     */
    void stop();

    /*
     * Set launch power/speed
     * @param power Power level (0.0 to 1.0)
     */
    void setPower(double power);

    /*
     * Check if launcher is ready to fire
     * @return true if ready for next shot
     */
    boolean isReadyToFire();

    /*
     * Check if launcher is currently firing
     * @return true if in firing sequence
     */
    boolean isFiring();
}
