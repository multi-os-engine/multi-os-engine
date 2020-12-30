package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * This enumeration describes the different types of user sets in presence events.
 */
@Generated
public final class HMPresenceEventUserType {
    @Generated
    private HMPresenceEventUserType() {
    }

    /**
     * Only current user's presence is used.
     */
    @Generated @NUInt public static final long CurrentUser = 0x0000000000000001L;
    /**
     * Presence of all home users is used.
     */
    @Generated @NUInt public static final long HomeUsers = 0x0000000000000002L;
    /**
     * Presence of custom set of home users is used.
     */
    @Generated @NUInt public static final long CustomUsers = 0x0000000000000003L;
}