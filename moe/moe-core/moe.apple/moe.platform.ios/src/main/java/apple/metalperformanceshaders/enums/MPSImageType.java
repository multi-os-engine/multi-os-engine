package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSImageType {
    @Generated
    private MPSImageType() {
    }

    /**
     * texture2d                Standard Metal type
     */
    @Generated public static final int MPSImageType2d = 0x00000000;
    /**
     * texture2d_array          Standard Metal type
     */
    @Generated public static final int MPSImageType2d_array = 0x00000001;
    /**
     * texture2d[]              MPSTextureArray<texture2d>
     */
    @Generated public static final int MPSImageTypeArray2d = 0x00000002;
    /**
     * texture2d_array[]        MPSTextureArray<texture2d_array>
     */
    @Generated public static final int MPSImageTypeArray2d_array = 0x00000003;
    /**
     * type & MPSImageType_ArrayMask == true means its array (not 2d texture)
     */
    @Generated public static final int MPSImageType_ArrayMask = 0x00000001;
    @Generated public static final int MPSImageType_BatchMask = 0x00000002;
    @Generated public static final int MPSImageType_typeMask = 0x00000003;
    @Generated public static final int MPSImageType_noAlpha = 0x00000004;
    @Generated public static final int MPSImageType_texelFormatMask = 0x00000038;
    @Generated public static final int MPSImageType_texelFormatShift = 0x00000003;
    @Generated public static final int MPSImageType_texelFormatStandard = 0x00000000;
    @Generated public static final int MPSImageType_texelFormatUnorm8 = 0x00000008;
    @Generated public static final int MPSImageType_texelFormatFloat16 = 0x00000010;
    @Generated public static final int MPSImageType_texelFormatBFloat16 = 0x00000018;
    @Generated public static final int MPSImageType_bitCount = 0x00000006;
    @Generated public static final int MPSImageType_mask = 0x0000003F;
    @Generated public static final int MPSImageType2d_noAlpha = 0x00000004;
    @Generated public static final int MPSImageType2d_array_noAlpha = 0x00000005;
    @Generated public static final int MPSImageTypeArray2d_noAlpha = 0x00000006;
    @Generated public static final int MPSImageTypeArray2d_array_noAlpha = 0x00000007;
}