package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SRDeletionReason {
    @Generated
    private SRDeletionReason() {
    }

    /**
     * The user initiated deletion
     */
    @Generated @NInt public static final long UserInitiated = 0x0000000000000000L;
    /**
     * Samples were removed due to low disk conditions
     */
    @Generated @NInt public static final long LowDiskSpace = 0x0000000000000001L;
    /**
     * Samples were removed because they were recorded beyond our retention limit
     */
    @Generated @NInt public static final long AgeLimit = 0x0000000000000002L;
    /**
     * Samples were removed because there are no longer any interested clients
     */
    @Generated @NInt public static final long NoInterestedClients = 0x0000000000000003L;
    /**
     * Samples were removed because the system was in an invalid state
     */
    @Generated @NInt public static final long SystemInitiated = 0x0000000000000004L;
}
