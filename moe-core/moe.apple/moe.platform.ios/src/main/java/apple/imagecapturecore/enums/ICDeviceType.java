package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * ------------------------------------------------------------------------------------------------------------------------------
 * [@const] ICDeviceType
 * 
 * Image Capture Device Types
 * [@constant] ICDeviceTypeCamera Camera device.
 * [@constant] ICDeviceTypeScanner Scanner device.
 * 
 * API-Since: 13.0
 */
@Generated
public final class ICDeviceType {
    @Generated
    private ICDeviceType() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Camera = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Scanner = 0x0000000000000002L;
}
