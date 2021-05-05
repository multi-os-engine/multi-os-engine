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
 */
@Generated
public final class ICDeviceType {
    @Generated
    private ICDeviceType() {
    }

    @Generated @NUInt public static final long Camera = 0x0000000000000001L;
    @Generated @NUInt public static final long Scanner = 0x0000000000000002L;
}