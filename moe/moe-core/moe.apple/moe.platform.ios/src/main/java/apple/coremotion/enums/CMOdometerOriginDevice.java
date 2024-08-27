package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CMOdometerOriginDevice
 * 
 * Discussion:
 * The device from which the odometer sample originates
 * 
 * API-Since: 15.4
 */
@Generated
public final class CMOdometerOriginDevice {
    @Generated
    private CMOdometerOriginDevice() {
    }

    /**
     * The origin of the odometer sample is unknown; it could be either local or remote.
     * 
     * API-Since: 15.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The odometer sample originated locally (i.e. the same device requesting the sample).
     * 
     * API-Since: 15.4
     */
    @Generated @NInt public static final long Local = 0x0000000000000001L;
    /**
     * The odometer sample originated on a paired device different to the local device.
     * 
     * API-Since: 15.4
     */
    @Generated @NInt public static final long Remote = 0x0000000000000002L;
}