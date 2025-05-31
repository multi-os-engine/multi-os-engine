package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 18.4
 */
@Generated
public final class MTREnergyEVSEState {
    @Generated
    private MTREnergyEVSEState() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated public static final byte NotPluggedIn = 0;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte PluggedInNoDemand = 1;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte PluggedInDemand = 2;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte PluggedInCharging = 3;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte SessionEnding = 5;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte Fault = 6;
}