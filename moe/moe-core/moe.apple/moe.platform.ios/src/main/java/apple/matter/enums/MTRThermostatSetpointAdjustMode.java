package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRThermostatSetpointAdjustMode {
    @Generated
    private MTRThermostatSetpointAdjustMode() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Heat = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatSetpointAdjustModeHeat
     */
    @Generated @Deprecated public static final byte HeatSetpoint = 0;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Cool = 1;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatSetpointAdjustModeCool
     */
    @Generated @Deprecated public static final byte CoolSetpoint = 1;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Both = 2;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatSetpointAdjustModeBoth
     */
    @Generated @Deprecated public static final byte HeatAndCoolSetpoints = 2;
}