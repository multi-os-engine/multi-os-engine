package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.4
 */
@Generated
public final class MTRCommissioningStatus {
    @Generated
    private MTRCommissioningStatus() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Success = 0x0000000000000001L;
    /**
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Failed = 0x0000000000000002L;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.5
     * Deprecated-Message: MTRCommissioningStatusDiscoveringMoreDevices is not used.
     */
    @Generated @Deprecated @NInt public static final long DiscoveringMoreDevices = 0x0000000000000003L;
}