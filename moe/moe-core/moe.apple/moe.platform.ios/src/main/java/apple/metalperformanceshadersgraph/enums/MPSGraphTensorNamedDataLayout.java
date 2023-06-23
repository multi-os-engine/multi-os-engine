package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] MPSGraphTensorNamedDataLayout
 * 
 * Tensor Layout
 * 
 * [@constant] MPSGraphTensorNamedDataLayoutNCHW LayoutNCHW
 * [@constant] MPSGraphTensorNamedDataLayoutNHWC LayoutNHWC
 * [@constant] MPSGraphTensorNamedDataLayoutOIHW LayoutOIHW
 * [@constant] MPSGraphTensorNamedDataLayoutHWIO LayoutHWIO
 * [@constant] MPSGraphTensorNamedDataLayoutCHW LayoutCHW
 * [@constant] MPSGraphTensorNamedDataLayoutHWC LayoutHWC
 * [@constant] MPSGraphTensorNamedDataLayoutHW LayoutHW
 */
@Generated
public final class MPSGraphTensorNamedDataLayout {
    @Generated
    private MPSGraphTensorNamedDataLayout() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long NCHW = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long NHWC = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long OIHW = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long HWIO = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long CHW = 0x0000000000000004L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long HWC = 0x0000000000000005L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long HW = 0x0000000000000006L;
}
