package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * --------------------------------------------------------------------------------------------------------------------
 * Constants
 * [@ICMediaPresentation]
 * 
 * [@constant] ICMediaPresentation controls the display of either transcoded or original assets, if the device supports
 * transcoding.
 * [@constant] ICMediaPresentationConvertedAssets sets the device presentation view to display transcoded assets only.
 * [@constant] ICMediaPresentationConvertedAssets sets the device presentation view to display original assets only.
 * 
 * API-Since: 14.0
 */
@Generated
public final class ICMediaPresentation {
    @Generated
    private ICMediaPresentation() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long ConvertedAssets = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long OriginalAssets = 0x0000000000000002L;
}
