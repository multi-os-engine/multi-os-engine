package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * This enumeration describes the different types of presence events.
 */
@Generated
public final class HMPresenceEventType {
    @Generated
    private HMPresenceEventType() {
    }

    /**
     * This corresponds to trigger an event for every user entering a home.
     * This cannot be added as predicate.
     */
    @Generated @NUInt public static final long EveryEntry = 0x0000000000000001L;
    /**
     * This corresponds to trigger an event for every user exiting a home.
     * This cannot be added as predicate.
     */
    @Generated @NUInt public static final long EveryExit = 0x0000000000000002L;
    /**
     * This corresponds to trigger an event for the first user entering a home.
     */
    @Generated @NUInt public static final long FirstEntry = 0x0000000000000003L;
    /**
     * This corresponds to trigger an event for the last user exiting a home.
     */
    @Generated @NUInt public static final long LastExit = 0x0000000000000004L;
    /**
     * Convenience value for First Entry to use in predicate of HMEventTrigger.
     */
    @Generated @NUInt public static final long AtHome = 0x0000000000000003L;
    /**
     * Convenience value for Last Exit to use in predicate of HMEventTrigger.
     */
    @Generated @NUInt public static final long NotAtHome = 0x0000000000000004L;
}