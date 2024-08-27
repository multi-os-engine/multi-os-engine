package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRThermostatFeature {
    @Generated
    private MTRThermostatFeature() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final int Heating = 0x00000001;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int Cooling = 0x00000002;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int Occupancy = 0x00000004;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int ScheduleConfiguration = 0x00000008;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatFeatureScheduleConfiguration
     */
    @Generated @Deprecated public static final int Schedule = 0x00000008;
    /**
     * API-Since: 16.1
     */
    @Generated public static final int Setback = 0x00000010;
    /**
     * API-Since: 16.4
     */
    @Generated public static final int AutoMode = 0x00000020;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatFeatureAutoMode
     */
    @Generated @Deprecated public static final int Automode = 0x00000020;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int LocalTemperatureNotExposed = 0x00000040;
}