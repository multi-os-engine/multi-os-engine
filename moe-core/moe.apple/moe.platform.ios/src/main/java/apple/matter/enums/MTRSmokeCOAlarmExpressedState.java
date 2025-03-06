package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 17.6
 */
@Generated
public final class MTRSmokeCOAlarmExpressedState {
    @Generated
    private MTRSmokeCOAlarmExpressedState() {
    }

    /**
     * API-Since: 17.6
     */
    @Generated public static final byte Normal = 0;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte SmokeAlarm = 1;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte COAlarm = 2;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte BatteryAlert = 3;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte Testing = 4;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte HardwareFault = 5;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte EndOfService = 6;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte InterconnectSmoke = 7;
    /**
     * API-Since: 17.6
     */
    @Generated public static final byte InterconnectCO = 8;
}