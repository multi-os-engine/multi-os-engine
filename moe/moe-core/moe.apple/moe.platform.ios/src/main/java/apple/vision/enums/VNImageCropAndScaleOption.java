package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class VNImageCropAndScaleOption {
    @Generated
    private VNImageCropAndScaleOption() {
    }

    /**
     * scale image maintaining aspect ratio to fit on the short side and crop centered on the long side
     */
    @Generated @NUInt public static final long CenterCrop = 0x0000000000000000L;
    /**
     * scale to size required by algorithm
     */
    @Generated @NUInt public static final long ScaleFit = 0x0000000000000001L;
    @Generated @NUInt public static final long ScaleFill = 0x0000000000000002L;
}