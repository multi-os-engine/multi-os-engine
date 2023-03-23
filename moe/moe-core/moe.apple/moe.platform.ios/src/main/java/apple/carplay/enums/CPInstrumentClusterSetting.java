package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 15.4
 */
@Generated
public final class CPInstrumentClusterSetting {
    @Generated
    private CPInstrumentClusterSetting() {
    }

    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Enabled = 0x0000000000000001L;
    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Disabled = 0x0000000000000002L;
    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long UserPreference = 0x0000000000000003L;
}