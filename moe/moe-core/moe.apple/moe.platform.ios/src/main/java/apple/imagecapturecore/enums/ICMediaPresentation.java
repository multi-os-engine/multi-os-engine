package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * -------------------------------------------------------------------------------------------------------------------- Constants
 * [@ICMediaPresentation]
 * 
 * [@constant] ICMediaPresentationConvertedAssets presents the device media contents
 * [@constant] ICScannerTransferModeMemoryBased Transfer the scan as data.
 */
@Generated
public final class ICMediaPresentation {
    @Generated
    private ICMediaPresentation() {
    }

    @Generated @NUInt public static final long ConvertedAssets = 0x0000000000000001L;
    @Generated @NUInt public static final long OriginalAssets = 0x0000000000000002L;
}