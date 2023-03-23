package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSNNPaddingMethod {
    @Generated
    private MPSNNPaddingMethod() {
    }

    /**
     * < Extra padding pixels are distributed as evenly as possible to all sides
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long AlignCentered = 0x0000000000000000L;
    /**
     * < Extra padding pixels appear on top and left sides
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long AlignTopLeft = 0x0000000000000001L;
    /**
     * < Extra padding pixels appear on the bottom and right sides
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long AlignBottomRight = 0x0000000000000002L;
    /**
     * < Extra padding pixels are not defined.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Align_reserved = 0x0000000000000003L;
    @Generated @NUInt public static final long AlignMask = 0x0000000000000003L;
    /**
     * < Extra padding pixels are accumulated to top and left sides
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long AddRemainderToTopLeft = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long AddRemainderToTopRight = 0x0000000000000004L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long AddRemainderToBottomLeft = 0x0000000000000008L;
    /**
     * < Extra padding pixels are accumulated to bottom and right sides
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long AddRemainderToBottomRight = 0x000000000000000CL;
    @Generated @NUInt public static final long AddRemainderToMask = 0x000000000000000CL;
    /**
     * < The result is the largest image for which *all* source pixels are valid for result pixels
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long SizeValidOnly = 0x0000000000000000L;
    /**
     * < The result is the same size as the input image (before strides)
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long SizeSame = 0x0000000000000010L;
    /**
     * < The result is the largest image for which *any* source pixel is valid for result pixels
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long SizeFull = 0x0000000000000020L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Size_reserved = 0x0000000000000030L;
    /**
     * < Use destinationImageDescriptorForSourceImages:sourceStates:forKernel:suggestedDescriptor: to calculate padding
     * and offset.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Custom = 0x0000000000004000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long SizeMask = 0x00000000000007F0L;
    /**
     * The caffe framework constrains the average pooling area to the limits of the padding area in cases
     * where a pixel would read beyond the padding area. Set this bit for Caffe emulation with average pooling.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ExcludeEdges = 0x0000000000008000L;
    /**
     * API-Since: 12.0
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NUInt public static final long CustomWhitelistForNodeFusion = 0x0000000000002000L;
    /**
     * < By itself, MPSNNPaddingMethodCustom will inhibit automatic fusion between nodes producing and consuming the
     * image described by the padding policy. MPSNNPaddingMethodCustomAllowForNodeFusion signals that the custom method
     * is benign and fusion may go ahead.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long CustomAllowForNodeFusion = 0x0000000000002000L;
}
