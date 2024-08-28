package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRPowerSourceWiredFault {
    @Generated
    private MTRPowerSourceWiredFault() {
    }

    /**
     * API-Since: 16.5
     */
    @Generated public static final byte Unspecified = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: Please use MTRPowerSourceWiredFaultUnspecified
     */
    @Generated @Deprecated public static final byte Unspecfied = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte OverVoltage = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte UnderVoltage = 2;
}