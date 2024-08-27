package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRPowerSourceBatChargeLevel {
    @Generated
    private MTRPowerSourceBatChargeLevel() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte OK = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRPowerSourceBatChargeLevelOK
     */
    @Generated @Deprecated public static final byte Ok = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Warning = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Critical = 2;
}