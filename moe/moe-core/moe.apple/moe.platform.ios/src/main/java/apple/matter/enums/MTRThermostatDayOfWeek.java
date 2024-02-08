package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRThermostatDayOfWeek {
    @Generated
    private MTRThermostatDayOfWeek() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Sunday = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Monday = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Tuesday = 4;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Wednesday = 8;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Thursday = 16;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Friday = 32;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Saturday = 64;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Away = -128;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRThermostatDayOfWeekAway
     */
    @Generated @Deprecated public static final byte AwayOrVacation = -128;
}