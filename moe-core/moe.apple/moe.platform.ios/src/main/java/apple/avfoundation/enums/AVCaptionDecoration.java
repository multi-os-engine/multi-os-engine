package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVCaptionDecoration
 * 
 * Choices for character decoration .
 * [@constant] AVCaptionDecorationNone Text is not decorated..
 * [@constant] AVCaptionDecorationUnderline Text is underlined.
 * [@constant] AVCaptionDecorationLineThrough Text has a strike through it.
 * [@constant] AVCaptionDecorationOverline Text has a line above the it.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionDecoration {
    @Generated
    private AVCaptionDecoration() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Underline = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long LineThrough = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Overline = 0x0000000000000004L;
}