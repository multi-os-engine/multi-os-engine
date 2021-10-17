package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GCDualSenseAdaptiveTriggerMode {
    @Generated
    private GCDualSenseAdaptiveTriggerMode() {
    }

    /**
     * The adaptive trigger effect is disabled.
     */
    @Generated @NInt public static final long Off = 0x0000000000000000L;
    /**
     * The adaptive trigger effect provides constant feedback from the start position onwards.
     */
    @Generated @NInt public static final long Feedback = 0x0000000000000001L;
    /**
     * The adaptive trigger effect provides feedback from the start position to the end position, emulating the feeling of pulling the trigger on a weapon.
     */
    @Generated @NInt public static final long Weapon = 0x0000000000000002L;
    /**
     * The adaptive trigger effect provides a constant vibration effect from the start position onwards.
     */
    @Generated @NInt public static final long Vibration = 0x0000000000000003L;
}
