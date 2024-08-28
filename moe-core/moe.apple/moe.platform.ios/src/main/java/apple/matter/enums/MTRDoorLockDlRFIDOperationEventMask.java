package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRDoorLockDlRFIDOperationEventMask {
    @Generated
    private MTRDoorLockDlRFIDOperationEventMask() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final char Unknown = 0x0001;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char Lock = 0x0002;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char Unlock = 0x0004;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char LockInvalidRFID = 0x0008;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char LockInvalidSchedule = 0x0010;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char UnlockInvalidRFID = 0x0020;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char UnlockInvalidSchedule = 0x0040;
}