package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionRegionWritingMode
 * 
 * Choices for region writing mode
 * 
 * [@constant] AVCaptionRegionWritingModeLeftToRightAndTopToBottom
 * [@constant] AVCaptionRegionWritingModeTopToBottomAndRightToLeft
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionRegionWritingMode {
    @Generated
    private AVCaptionRegionWritingMode() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long LeftToRightAndTopToBottom = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long TopToBottomAndRightToLeft = 0x0000000000000002L;
}