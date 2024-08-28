package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRThermostatModeForSequence {
    @Generated
    private MTRThermostatModeForSequence() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte HeatSetpointPresent = 1;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatModeForSequenceHeatSetpointPresent
     */
    @Generated @Deprecated public static final byte HeatSetpointFieldPresent = 1;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte CoolSetpointPresent = 2;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatModeForSequenceCoolSetpointPresent
     */
    @Generated @Deprecated public static final byte CoolSetpointFieldPresent = 2;
}