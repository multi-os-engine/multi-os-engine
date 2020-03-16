package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSNNPaddingMethod {
    @Generated
    private MPSNNPaddingMethod() {
    }

    @Generated @NUInt public static final long AlignCentered = 0x0000000000000000L;
    @Generated @NUInt public static final long AlignTopLeft = 0x0000000000000001L;
    @Generated @NUInt public static final long AlignBottomRight = 0x0000000000000002L;
    @Generated @NUInt public static final long Align_reserved = 0x0000000000000003L;
    @Generated @NUInt public static final long AlignMask = 0x0000000000000003L;
    @Generated @NUInt public static final long AddRemainderToTopLeft = 0x0000000000000000L;
    @Generated @NUInt public static final long AddRemainderToTopRight = 0x0000000000000004L;
    @Generated @NUInt public static final long AddRemainderToBottomLeft = 0x0000000000000008L;
    @Generated @NUInt public static final long AddRemainderToBottomRight = 0x000000000000000CL;
    @Generated @NUInt public static final long AddRemainderToMask = 0x000000000000000CL;
    @Generated @NUInt public static final long SizeValidOnly = 0x0000000000000000L;
    @Generated @NUInt public static final long SizeSame = 0x0000000000000010L;
    @Generated @NUInt public static final long SizeFull = 0x0000000000000020L;
    @Generated @NUInt public static final long Size_reserved = 0x0000000000000030L;
    @Generated @NUInt public static final long Custom = 0x0000000000004000L;
    @Generated @NUInt public static final long SizeMask = 0x00000000000007F0L;
    @Generated @NUInt public static final long ExcludeEdges = 0x0000000000008000L;
    @Generated @NUInt public static final long CustomWhitelistForNodeFusion = 0x0000000000002000L;
}