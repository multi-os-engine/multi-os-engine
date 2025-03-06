package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionRubyPosition
 * 
 * Choices for Ruby position
 * [@constant] AVCaptionRubyPositionBefore
 * Display Ruby text above horizontal text or right of vertical text in a right to left block progression.
 * [@constant] AVCaptionRubyPositionAfter
 * Display Ruby text below horizontal text or left of vertical text in a right to left block progression.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionRubyPosition {
    @Generated
    private AVCaptionRubyPosition() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Before = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long After = 0x0000000000000001L;
}