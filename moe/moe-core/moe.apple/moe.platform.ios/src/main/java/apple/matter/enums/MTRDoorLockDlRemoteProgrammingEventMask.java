package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRDoorLockDlRemoteProgrammingEventMask {
    @Generated
    private MTRDoorLockDlRemoteProgrammingEventMask() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final char Unknown = 0x0001;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ProgrammingPINChanged = 0x0002;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char PINAdded = 0x0004;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char PINCleared = 0x0008;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char PINChanged = 0x0010;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char RFIDCodeAdded = 0x0020;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char RFIDCodeCleared = 0x0040;
}