package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * SRWristTemperatureCondition
 * 
 * Discussion:
 * Indicates if the temperature accuracy has been impacted by any user initiated activiy.
 * 
 * Definitions of each condition as follows:
 * - SRWristTemperatureConditionNone indicates data has not been impacted.
 * - SRWristTemperatureConditionOffWrist indicates device has been off wrist and data has been impacted.
 * - SRWristTemperatureConditionOnCharger indicates device has been on the charger and data has been impacted.
 * - SRWristTemperatureConditionInMotion indicates data has been impacted by movement.
 * 
 * API-Since: 17.0
 */
@Generated
public final class SRWristTemperatureCondition {
    @Generated
    private SRWristTemperatureCondition() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long OffWrist = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long OnCharger = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long InMotion = 0x0000000000000004L;
}