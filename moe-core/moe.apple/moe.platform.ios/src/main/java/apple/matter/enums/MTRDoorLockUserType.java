package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRDoorLockUserType {
    @Generated
    private MTRDoorLockUserType() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte UnrestrictedUser = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockUserTypeUnrestrictedUser
     */
    @Generated @Deprecated public static final byte Unrestricted = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte YearDayScheduleUser = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte WeekDayScheduleUser = 2;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte ProgrammingUser = 3;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDoorLockUserTypeProgrammingUser
     */
    @Generated @Deprecated public static final byte MasterUser = 3;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte NonAccessUser = 4;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte ForcedUser = 5;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte DisposableUser = 6;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte ExpiringUser = 7;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte ScheduleRestrictedUser = 8;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte RemoteOnlyUser = 9;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: This value is not part of the specification and will be removed
     */
    @Generated @Deprecated public static final byte NotSupported = -1;
}