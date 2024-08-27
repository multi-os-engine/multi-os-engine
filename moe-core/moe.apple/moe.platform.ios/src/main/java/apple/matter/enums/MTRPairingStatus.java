package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 16.1
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTRCommissioningStatus
 */
@Generated
@Deprecated
public final class MTRPairingStatus {
    @Generated
    private MTRPairingStatus() {
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRCommissioningStatusUnknown
     */
    @Generated @Deprecated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRCommissioningStatusSuccess
     */
    @Generated @Deprecated @NUInt public static final long Success = 0x0000000000000001L;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRCommissioningStatusFailed
     */
    @Generated @Deprecated @NUInt public static final long Failed = 0x0000000000000002L;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: MTRPairingStatusDiscoveringMoreDevices is not used.
     */
    @Generated @Deprecated @NUInt public static final long DiscoveringMoreDevices = 0x0000000000000003L;
}