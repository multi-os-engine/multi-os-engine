package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 17.6
 */
@Generated
public final class MTRValveConfigurationAndControlValveFaultBitmap {
    @Generated
    private MTRValveConfigurationAndControlValveFaultBitmap() {
    }

    /**
     * API-Since: 17.6
     */
    @Generated public static final char GeneralFault = 0x0001;
    /**
     * API-Since: 17.6
     */
    @Generated public static final char Blocked = 0x0002;
    /**
     * API-Since: 17.6
     */
    @Generated public static final char Leaking = 0x0004;
    /**
     * API-Since: 17.6
     */
    @Generated public static final char NotConnected = 0x0008;
    /**
     * API-Since: 17.6
     */
    @Generated public static final char ShortCircuit = 0x0010;
    /**
     * API-Since: 17.6
     */
    @Generated public static final char CurrentExceeded = 0x0020;
}