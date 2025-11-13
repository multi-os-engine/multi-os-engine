package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Connection state of an external sync device
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVExternalSyncDeviceStatus {
    @Generated
    private AVExternalSyncDeviceStatus() {
    }

    /**
     * Indicates that external sync signal is not connected, or has transitioned to a state that is not recoverable.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unavailable = 0x0000000000000000L;
    /**
     * Indicates that a device supporting external sync is connected, but calibration has not started.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    /**
     * Indicates that the external sync signal is connected and that the AVExternalSyncDevice object is calibrating to
     * follow.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Calibrating = 0x0000000000000002L;
    /**
     * Indicates that the ``AVExternalSyncDevice`` object is running and that the clock property on
     * ``AVExternalSyncDevice`` is calibrated to the external sync signal.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long ActiveSync = 0x0000000000000003L;
    /**
     * Indicates that the AVExternalSyncDevice was calibrated to follow the external sync, but the sync signal has been
     * lost. The camera will continue to match the last signal it received, but sync is not guaranteed.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long FreeRunSync = 0x0000000000000004L;
}