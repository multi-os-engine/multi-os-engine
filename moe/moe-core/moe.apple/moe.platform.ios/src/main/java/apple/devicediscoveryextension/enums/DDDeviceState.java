package apple.devicediscoveryextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ===========================================================================================================================
 * State of the device.
 */
@Generated
public final class DDDeviceState {
    @Generated
    private DDDeviceState() {
    }

    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * Invalid/unapproved state.
     */
    @Generated @NInt public static final long Activating = 0x000000000000000AL;
    /**
     * Selected by the user.
     */
    @Generated @NInt public static final long Activated = 0x0000000000000014L;
    /**
     * Authorized and connected.
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000019L;
    /**
     * Authorized by the user.
     */
    @Generated @NInt public static final long Invalidating = 0x000000000000001EL;
}