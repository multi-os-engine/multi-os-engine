package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A bitfield type that specifies an HDR mode.
 * 
 * API-Since: 11.2
 * Deprecated-Since: 26.0
 * Deprecated-Message: The deprecated availableHDRModes uses this enum. Use eligibleForHDRPlayback instead
 */
@Deprecated
@Generated
public final class AVPlayerHDRMode {
    @Generated
    private AVPlayerHDRMode() {
    }

    /**
     * Indicates that HLG (Hybrid Log-Gamma) HDR mode is available.
     * 
     * API-Since: 11.2
     * Deprecated-Since: 26.0
     * Deprecated-Message: The deprecated availableHDRModes uses this enum. Use eligibleForHDRPlayback instead
     */
    @Deprecated @Generated @NInt public static final long HLG = 0x0000000000000001L;
    /**
     * Indicates that HDR10 HDR mode is available.
     * 
     * API-Since: 11.2
     * Deprecated-Since: 26.0
     * Deprecated-Message: The deprecated availableHDRModes uses this enum. Use eligibleForHDRPlayback instead
     */
    @Deprecated @Generated @NInt public static final long HDR10 = 0x0000000000000002L;
    /**
     * Indicates that Dolby Vision HDR mode is available.
     * 
     * API-Since: 11.2
     * Deprecated-Since: 26.0
     * Deprecated-Message: The deprecated availableHDRModes uses this enum. Use eligibleForHDRPlayback instead
     */
    @Deprecated @Generated @NInt public static final long DolbyVision = 0x0000000000000004L;
}
