package apple.nearbyinteraction.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Reasons to remove a nearby object.
 */
@Generated
public final class NINearbyObjectRemovalReason {
    @Generated
    private NINearbyObjectRemovalReason() {
    }

    /**
     * The system has not received new activity from this object for over the allowed period.
     */
    @Generated @NInt public static final long Timeout = 0x0000000000000000L;
    /**
     * The peer device has signaled that it will no longer participate in the session.
     * This removal reason is delivered on a best effort basis and is not guaranteed to be received.
     */
    @Generated @NInt public static final long PeerEnded = 0x0000000000000001L;
}
