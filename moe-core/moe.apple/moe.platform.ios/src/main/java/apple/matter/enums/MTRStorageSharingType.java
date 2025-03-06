package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.6
 */
@Generated
public final class MTRStorageSharingType {
    @Generated
    private MTRStorageSharingType() {
    }

    /**
     * Data must not be shared at all (just store locally).
     * 
     * API-Since: 17.6
     */
    @Generated @NUInt public static final long NotShared = 0x0000000000000000L;
    /**
     * Data must be shared, but only between controllers that have the same node
     * identity (same fabric, same node ID, same CATs).
     * 
     * API-Since: 17.6
     */
    @Generated @NUInt public static final long SameIdentity = 0x0000000000000001L;
    /**
     * Data must be shared, but only between controllers that have the same
     * access to devices (e.g. controllers that all have the same CATs if ACLs
     * are being done via CATs).
     * 
     * API-Since: 17.6
     */
    @Generated @NUInt public static final long SameACLs = 0x0000000000000002L;
    /**
     * Data must be shared across all controllers on a given fabric.
     * 
     * API-Since: 17.6
     */
    @Generated @NUInt public static final long SameFabric = 0x0000000000000003L;
}