package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class SRDeletionReason {
    @Generated
    private SRDeletionReason() {
    }

    /**
     * The user initiated deletion
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long UserInitiated = 0x0000000000000000L;
    /**
     * Samples were removed due to low disk conditions
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long LowDiskSpace = 0x0000000000000001L;
    /**
     * Samples were removed because they were recorded beyond our retention limit
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long AgeLimit = 0x0000000000000002L;
    /**
     * Samples were removed because there are no longer any interested clients
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NoInterestedClients = 0x0000000000000003L;
    /**
     * Samples were removed because the system was in an invalid state
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long SystemInitiated = 0x0000000000000004L;
}
