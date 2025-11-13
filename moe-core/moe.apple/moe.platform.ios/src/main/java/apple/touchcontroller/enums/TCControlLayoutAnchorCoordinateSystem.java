package apple.touchcontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines the coodinate system for an anchor point.
 * 
 * API-Since: 26.0
 */
@Generated
public final class TCControlLayoutAnchorCoordinateSystem {
    @Generated
    private TCControlLayoutAnchorCoordinateSystem() {
    }

    /**
     * Anchors are positioned relative to the device's screen size.
     * - On larger devices, the coordinate system is shrunk for easier handling.
     * - On smaller devices, this is equivalent to `TCControlLayoutAnchorCoordinateSystemAbsolute`.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Relative = 0x0000000000000000L;
    /**
     * Anchors are positioned according to the absolute edges of the sceren.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Absolute = 0x0000000000000001L;
}