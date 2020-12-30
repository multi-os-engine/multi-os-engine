package apple.iosurface.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class IOSurfaceSubsampling {
    @Generated
    private IOSurfaceSubsampling() {
    }

    @Generated public static final int SubsamplingUnknown = 0x00000000;
    /**
     * Includes "4:4:4"
     */
    @Generated public static final int SubsamplingNone = 0x00000001;
    /**
     * Chroma downsampled by 2x1
     */
    @Generated public static final int Subsampling422 = 0x00000002;
    /**
     * Chroma downsampled by 2x2
     */
    @Generated public static final int Subsampling420 = 0x00000003;
    /**
     * Chroma downsampled by 4x1
     */
    @Generated public static final int Subsampling411 = 0x00000004;
}