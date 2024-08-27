package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRDoorLockUserStatus {
    @Generated
    private MTRDoorLockUserStatus() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Available = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte OccupiedEnabled = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte OccupiedDisabled = 3;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: This value is not part of the specification and will be removed
     */
    @Generated @Deprecated public static final byte NotSupported = -1;
}