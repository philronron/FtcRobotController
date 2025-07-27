package org.firstinspires.ftc.teamcode.Interface;

/*
 * Sensor System Interface
 *
 * For sensor-based detection and measurement
 * Examples: Distance sensors, color sensors, limit switches
 */
public interface SensorSystem {
    /*
     * Get current sensor reading
     * @return Sensor value in appropriate units
     */
    double getSensorValue();

    /*
     * Check if sensor detects target condition
     * @return true if condition is met
     */
    boolean isTriggered();

    /*
     * Set trigger threshold for boolean detection
     * @param threshold Value that triggers boolean response
     */
    void setThreshold(double threshold);

    /*
     * Check if sensor is functioning properly
     * @return true if sensor is operational
     */
    boolean isSensorWorking();
}
