package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] AVPlayerHDRMode
 * <p>
 * A bitfield type that specifies an HDR mode.
 * <p>
 * [@constant]	AVPlayerHDRModeHLG
 * <p>
 * Indicates that HLG (Hybrid Log-Gamma) HDR mode is available.
 * [@constant]	AVPlayerHDRModeHDR10
 * <p>
 * Indicates that HDR10 HDR mode is available.
 * [@constant]	AVPlayerHDRModeDolbyVision
 * <p>
 * Indicates that Dolby Vision HDR mode is available.
 */
@Generated
public final class AVPlayerHDRMode {
    @Generated
    private AVPlayerHDRMode() {
    }

    @Generated @NInt public static final long HLG = 0x0000000000000001L;
    @Generated @NInt public static final long HDR10 = 0x0000000000000002L;
    @Generated @NInt public static final long DolbyVision = 0x0000000000000004L;
}
