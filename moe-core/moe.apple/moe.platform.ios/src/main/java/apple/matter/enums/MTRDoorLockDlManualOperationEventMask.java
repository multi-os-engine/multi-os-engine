package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRDoorLockDlManualOperationEventMask {
    @Generated
    private MTRDoorLockDlManualOperationEventMask() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final char Unknown = 0x0001;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ThumbturnLock = 0x0002;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ThumbturnUnlock = 0x0004;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char OneTouchLock = 0x0008;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char KeyLock = 0x0010;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char KeyUnlock = 0x0020;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char AutoLock = 0x0040;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ScheduleLock = 0x0080;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ScheduleUnlock = 0x0100;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ManualLock = 0x0200;
    /**
     * API-Since: 16.1
     */
    @Generated public static final char ManualUnlock = 0x0400;
}