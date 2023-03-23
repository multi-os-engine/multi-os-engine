package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@const] ICDeviceLocationTypeMask
 * 
 * Image Capture Device Location Type Mask
 * [@constant] ICDeviceLocationTypeMaskLocal Mask to detect a local (e.g., USB or FireWire) device.
 * [@constant] ICDeviceLocationTypeMaskShared Mask to detect a device by another Macintosh host.
 * [@constant] ICDeviceLocationTypeMaskBonjour Mask to detect a network device that publishes a Bonjour service.
 * [@constant] ICDeviceLocationTypeMaskBluetooth Mask to detect paired Bluetooth device.
 * [@constant] ICDeviceLocationTypeMaskRemote Mask to detect a remote (shared, Bonjour, Bluetooth) device.
 * 
 * API-Since: 15.2
 */
@Generated
public final class ICDeviceLocationTypeMask {
    @Generated
    private ICDeviceLocationTypeMask() {
    }

    /**
     * API-Since: 15.2
     */
    @Generated @NUInt public static final long Local = 0x0000000000000100L;
    /**
     * API-Since: 15.2
     */
    @Generated @NUInt public static final long Shared = 0x0000000000000200L;
    /**
     * API-Since: 15.2
     */
    @Generated @NUInt public static final long Bonjour = 0x0000000000000400L;
    /**
     * API-Since: 15.2
     */
    @Generated @NUInt public static final long Bluetooth = 0x0000000000000800L;
    /**
     * API-Since: 15.2
     */
    @Generated @NUInt public static final long Remote = 0x000000000000FE00L;
}