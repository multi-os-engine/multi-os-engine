package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSDeviceCapsValues {
    @Generated
    private MPSDeviceCapsValues() {
    }

    @Generated public static final int CapsNull = 0x00000000;
    @Generated public static final int SupportsReadableArrayOfTextures = 0x00000001;
    @Generated public static final int SupportsWritableArrayOfTextures = 0x00000002;
    @Generated public static final int SupportsReadWriteTextures = 0x00000004;
    @Generated public static final int SupportsSimdgroupBarrier = 0x00000008;
    @Generated public static final int SupportsQuadShuffle = 0x00000010;
    @Generated public static final int SupportsSimdShuffle = 0x00000020;
    @Generated public static final int SupportsSimdReduction = 0x00000040;
    @Generated public static final int SupportsFloat32Filtering = 0x00000080;
    @Generated public static final int SupportsNorm16BicubicFiltering = 0x00000100;
    @Generated public static final int SupportsFloat16BicubicFiltering = 0x00000200;
    @Generated public static final int IsAppleDevice = 0x00000400;
    @Generated public static final int SupportsSimdShuffleAndFill = 0x00000800;
    @Generated public static final int SupportsBFloat16Arithmetic = 0x00001000;
    @Generated public static final int CapsLast = 0x00002000;
}