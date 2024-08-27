package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Tensor Layout
 */
@Generated
public final class MPSGraphTensorNamedDataLayout {
    @Generated
    private MPSGraphTensorNamedDataLayout() {
    }

    /**
     * LayoutNCHW
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long NCHW = 0x0000000000000000L;
    /**
     * LayoutNHWC
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long NHWC = 0x0000000000000001L;
    /**
     * LayoutOIHW
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long OIHW = 0x0000000000000002L;
    /**
     * LayoutHWIO
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long HWIO = 0x0000000000000003L;
    /**
     * LayoutCHW
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long CHW = 0x0000000000000004L;
    /**
     * LayoutHWC
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long HWC = 0x0000000000000005L;
    /**
     * LayoutHW
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long HW = 0x0000000000000006L;
    /**
     * LayoutNCDHW
     * 
     * API-Since: 16.3
     */
    @Generated @NUInt public static final long NCDHW = 0x0000000000000007L;
    /**
     * LayoutNDHWC
     * 
     * API-Since: 16.3
     */
    @Generated @NUInt public static final long NDHWC = 0x0000000000000008L;
    /**
     * LayoutOIDHW
     * 
     * API-Since: 16.3
     */
    @Generated @NUInt public static final long OIDHW = 0x0000000000000009L;
    /**
     * LayoutDHWIO
     * 
     * API-Since: 16.3
     */
    @Generated @NUInt public static final long DHWIO = 0x000000000000000AL;
}
