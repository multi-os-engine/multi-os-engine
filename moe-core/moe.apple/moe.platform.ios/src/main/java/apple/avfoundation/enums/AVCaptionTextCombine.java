package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionTextCombine
 * 
 * Choices for text combine.
 * 
 * Text combine is a special rendering policy to combine multiple characters into one unit and present it in upright
 * position in a vertical text flow in order to accomplish so-called "Tate-Chu-Yoko" layout, or horizontal-in-vertical
 * layout.
 * 
 * For example, it can be used to render "2017" horizontally in a vertical text.
 * 
 * [@constant] AVCaptionTextCombineNone
 * Don't combine text upright. It is the same as not specifying the style.
 * 
 * [@constant] AVCaptionTextCombineAll
 * Combine all the characters.
 * 
 * [@constant] AVCaptionTextCombineOneDigit
 * Make one digit upright.
 * 
 * [@constant] AVCaptionTextCombineTwoDigits
 * Combine two consecutive digits
 * 
 * [@constant] AVCaptionTextCombineThreeDigits
 * Combine three consecutive digits
 * 
 * [@constant] AVCaptionTextCombineFourDigits
 * Combine four consecutive digits
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionTextCombine {
    @Generated
    private AVCaptionTextCombine() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long All = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long OneDigit = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long TwoDigits = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ThreeDigits = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long FourDigits = 0x0000000000000004L;
}