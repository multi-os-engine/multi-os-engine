package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Available super-resolution processor model status types.
 */
@Generated
public final class VTSuperResolutionScalerConfigurationModelStatus {
    @Generated
    private VTSuperResolutionScalerConfigurationModelStatus() {
    }

    @Generated @NInt public static final long DownloadRequired = 0x0000000000000000L;
    @Generated @NInt public static final long Downloading = 0x0000000000000001L;
    @Generated @NInt public static final long Ready = 0x0000000000000002L;
}