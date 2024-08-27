package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRWindowCoveringSafetyStatus {
    @Generated
    private MTRWindowCoveringSafetyStatus() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final char RemoteLockout = 0x0001;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char TamperDetection = 0x0002;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char FailedCommunication = 0x0004;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char PositionFailure = 0x0008;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ThermalProtection = 0x0010;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ObstacleDetected = 0x0020;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char Power = 0x0040;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char StopInput = 0x0080;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char MotorJammed = 0x0100;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char HardwareFailure = 0x0200;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ManualOperation = 0x0400;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char Protection = 0x0800;
}