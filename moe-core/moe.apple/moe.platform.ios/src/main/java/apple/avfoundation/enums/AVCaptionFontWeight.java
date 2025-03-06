package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionFontWeight
 * 
 * Choices for font weight.
 * [@constant] AVCaptionFontWeightUnknown Font weight is unknown.
 * [@constant] AVCaptionFontWeightNormal Font weight is normal (i.e., not bold).
 * [@constant] AVCaptionFontWeightBold Font weight is bold.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionFontWeight {
    @Generated
    private AVCaptionFontWeight() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Normal = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Bold = 0x0000000000000002L;
}