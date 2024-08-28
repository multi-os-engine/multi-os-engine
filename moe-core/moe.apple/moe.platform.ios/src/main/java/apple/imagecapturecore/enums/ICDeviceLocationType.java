package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@const] ICDeviceLocationType
 * 
 * Image Capture Device Location Types
 * [@constant] ICDeviceLocationTypeLocal Device found directly attached to the Macintosh via its USB or FireWire port.
 * [@constant] ICDeviceLocationTypeShared Device found over the network by searching for devices shared by other
 * Macintosh hosts.
 * [@constant] ICDeviceLocationTypeBonjour Device found over the network by searching for Bonjour services supported by
 * Image Capture.
 * [@constant] ICDeviceLocationTypeBluetooth Device found as a paired Bluetooth device.
 * 
 * API-Since: 16.0
 */
@Generated
public final class ICDeviceLocationType {
    @Generated
    private ICDeviceLocationType() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Local = 0x0000000000000100L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Shared = 0x0000000000000200L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Bonjour = 0x0000000000000400L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Bluetooth = 0x0000000000000800L;
}