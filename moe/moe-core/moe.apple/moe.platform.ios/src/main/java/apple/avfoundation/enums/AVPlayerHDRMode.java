package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] AVPlayerHDRMode
 * 
 * A bitfield type that specifies an HDR mode.
 * 
 * [@constant] AVPlayerHDRModeHLG
 * 
 * Indicates that HLG (Hybrid Log-Gamma) HDR mode is available.
 * [@constant] AVPlayerHDRModeHDR10
 * 
 * Indicates that HDR10 HDR mode is available.
 * [@constant] AVPlayerHDRModeDolbyVision
 * 
 * Indicates that Dolby Vision HDR mode is available.
 * 
 * API-Since: 11.2
 */
@Generated
public final class AVPlayerHDRMode {
    @Generated
    private AVPlayerHDRMode() {
    }

    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long HLG = 0x0000000000000001L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long HDR10 = 0x0000000000000002L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long DolbyVision = 0x0000000000000004L;
}
