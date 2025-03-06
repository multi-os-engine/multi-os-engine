package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionTextAlignment
 * 
 * Alignment of a caption within the containing region.
 * [@constant] AVCaptionTextAlignmentStart
 * Aligned to the start of inline progression direction; e.g. left in left-to-right writing mode and right in
 * right-to-left writing mode.
 * [@constant] AVCaptionTextAlignmentEnd
 * Aligned to the end of inline progression direction; e.g. right in left-to-right writing mode and right in
 * right-to-left writing mode.
 * [@constant] AVCaptionTextAlignmentCenter
 * Aligned at center in inline progression direction.
 * [@constant] AVCaptionTextAlignmentLeft
 * Aligned to left in horizontal writing mode or top in vertical writing mode.
 * [@constant] AVCaptionTextAlignmentRight
 * Aligned to right in horizontal writing mode or bottom in vertical writing mode.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionTextAlignment {
    @Generated
    private AVCaptionTextAlignment() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Start = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long End = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Center = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Left = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Right = 0x0000000000000004L;
}