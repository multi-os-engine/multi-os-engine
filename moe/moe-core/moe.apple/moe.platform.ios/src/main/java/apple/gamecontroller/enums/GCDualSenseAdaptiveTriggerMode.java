package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.5
 */
@Generated
public final class GCDualSenseAdaptiveTriggerMode {
    @Generated
    private GCDualSenseAdaptiveTriggerMode() {
    }

    /**
     * The adaptive trigger effect is disabled.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Off = 0x0000000000000000L;
    /**
     * The adaptive trigger effect provides constant feedback from the start position onwards.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Feedback = 0x0000000000000001L;
    /**
     * The adaptive trigger effect provides feedback from the start position to the end position, emulating the feeling
     * of pulling the trigger on a weapon.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Weapon = 0x0000000000000002L;
    /**
     * The adaptive trigger effect provides a constant vibration effect from the start position onwards.
     * 
     * API-Since: 14.5
     */
    @Generated @NInt public static final long Vibration = 0x0000000000000003L;
    /**
     * The adaptive trigger effect provides feedback from the start position to the end position, linearly interpolated
     * between the start and end strengths.
     * 
     * API-Since: 15.4
     */
    @Generated @NInt public static final long SlopeFeedback = 0x0000000000000004L;
}
