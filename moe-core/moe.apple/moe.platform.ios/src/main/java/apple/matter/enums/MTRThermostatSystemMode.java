package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRThermostatSystemMode {
    @Generated
    private MTRThermostatSystemMode() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Off = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Auto = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Cool = 3;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Heat = 4;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte EmergencyHeat = 5;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatSystemModeEmergencyHeat
     */
    @Generated @Deprecated public static final byte EmergencyHeating = 5;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Precooling = 6;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte FanOnly = 7;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Dry = 8;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Sleep = 9;
}