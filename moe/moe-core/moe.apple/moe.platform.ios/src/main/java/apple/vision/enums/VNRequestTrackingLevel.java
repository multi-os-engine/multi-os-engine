package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Tracking level options to favor speed or location accuracy. The VNRequestTrackingLevelFast is the default option used by trackers.
 */
@Generated
public final class VNRequestTrackingLevel {
    @Generated
    private VNRequestTrackingLevel() {
    }

    @Generated @NUInt public static final long Accurate = 0x0000000000000000L;
    @Generated @NUInt public static final long Fast = 0x0000000000000001L;
}