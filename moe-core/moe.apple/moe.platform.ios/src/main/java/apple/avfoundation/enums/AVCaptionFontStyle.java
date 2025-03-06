package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionFontStyle
 * 
 * Choices for character style.
 * [@constant] AVCaptionFontStyleUnknown Font style is not specified.
 * [@constant] AVCaptionFontStyleNormal Font is normal (i.e., not italic)
 * [@constant] AVCaptionFontStyleItalic Font is italic.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionFontStyle {
    @Generated
    private AVCaptionFontStyle() {
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
    @Generated @NInt public static final long Italic = 0x0000000000000002L;
}