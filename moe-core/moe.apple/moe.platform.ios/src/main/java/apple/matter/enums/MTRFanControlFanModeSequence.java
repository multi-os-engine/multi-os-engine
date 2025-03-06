package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 17.0
 */
@Generated
public final class MTRFanControlFanModeSequence {
    @Generated
    private MTRFanControlFanModeSequence() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final byte LowMedHigh = 0;
    /**
     * API-Since: 17.0
     */
    @Generated public static final byte LowHigh = 1;
    /**
     * API-Since: 17.0
     */
    @Generated public static final byte LowMedHighAuto = 2;
    /**
     * API-Since: 17.0
     */
    @Generated public static final byte LowHighAuto = 3;
    /**
     * API-Since: 17.0
     * Deprecated-Since: 17.4
     * Deprecated-Message: Please use MTRFanControlFanModeSequenceOffHighAuto
     */
    @Deprecated @Generated public static final byte OnAuto = 4;
    /**
     * API-Since: 17.0
     * Deprecated-Since: 17.4
     * Deprecated-Message: Please use MTRFanControlFanModeSequenceOffHigh
     */
    @Deprecated @Generated public static final byte On = 5;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte HighAuto = 4;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte High = 5;
}