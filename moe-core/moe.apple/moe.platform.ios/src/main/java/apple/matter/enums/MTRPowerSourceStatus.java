package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRPowerSourceStatus {
    @Generated
    private MTRPowerSourceStatus() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Unspecified = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRPowerSourceStatusUnspecified
     */
    @Generated @Deprecated public static final byte Unspecfied = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Active = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Standby = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Unavailable = 3;
}