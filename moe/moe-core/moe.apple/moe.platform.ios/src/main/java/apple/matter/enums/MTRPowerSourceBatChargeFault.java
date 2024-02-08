package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRPowerSourceBatChargeFault {
    @Generated
    private MTRPowerSourceBatChargeFault() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Unspecified = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRPowerSourceBatChargeFaultUnspecified
     */
    @Generated @Deprecated public static final byte Unspecfied = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte AmbientTooHot = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte AmbientTooCold = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte BatteryTooHot = 3;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte BatteryTooCold = 4;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte BatteryAbsent = 5;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte BatteryOverVoltage = 6;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte BatteryUnderVoltage = 7;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte ChargerOverVoltage = 8;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte ChargerUnderVoltage = 9;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte SafetyTimeout = 10;
}