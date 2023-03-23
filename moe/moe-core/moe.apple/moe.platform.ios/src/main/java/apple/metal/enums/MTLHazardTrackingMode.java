package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLHazardTrackingMode
 * 
 * Describes how hazard tracking is performed.
 * [@constant] MTLHazardTrackingModeDefault The default hazard tracking mode for the context. Refer to the usage of the
 * field for semantics.
 * [@constant] MTLHazardTrackingModeUntracked Do not perform hazard tracking.
 * [@constant] MTLHazardTrackingModeTracked Do perform hazard tracking.
 * 
 * API-Since: 13.0
 */
@Generated
public final class MTLHazardTrackingMode {
    @Generated
    private MTLHazardTrackingMode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Untracked = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Tracked = 0x0000000000000002L;
}
