package apple.devicediscoveryextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ===========================================================================================================================
 * Type of event.
 */
@Generated
public final class DDEventType {
    @Generated
    private DDEventType() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Unknown event. Placeholder for initializing event types.
     */
    @Generated @NInt public static final long DeviceFound = 0x0000000000000028L;
    /**
     * [DDDeviceEvent] Device found.
     */
    @Generated @NInt public static final long DeviceLost = 0x0000000000000029L;
    /**
     * [DDDeviceEvent] Device lost.
     */
    @Generated @NInt public static final long DeviceChanged = 0x000000000000002AL;
}