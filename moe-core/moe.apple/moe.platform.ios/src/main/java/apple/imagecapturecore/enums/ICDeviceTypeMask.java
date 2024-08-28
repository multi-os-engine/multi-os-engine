package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@const] ICDeviceTypeMask
 * 
 * Image Capture Device Type Mask
 * [@constant] ICDeviceTypeMaskCamera Mask to detect a camera device.
 * [@constant] ICDeviceTypeMaskScanner Mask to detect a scanner device.
 * 
 * API-Since: 15.2
 */
@Generated
public final class ICDeviceTypeMask {
    @Generated
    private ICDeviceTypeMask() {
    }

    /**
     * API-Since: 15.2
     */
    @Generated @NUInt public static final long Camera = 0x0000000000000001L;
    /**
     * API-Since: 15.2
     */
    @Generated @NUInt public static final long Scanner = 0x0000000000000002L;
}