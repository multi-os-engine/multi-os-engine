package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionRubyAlignment
 * 
 * Choices for Ruby alignment
 * 
 * Given a ruby text rendering area denoted as [...], each spacing policy works as follows.
 * 
 * Start [Ruby Text ]
 * 
 * Center [ Ruby Text ]
 * 
 * SpaceBetween [R u b y T e x t] <- 'R' and 't' are aligned with start end end edges, spaces between each Ruby text
 * character is equal.
 * 
 * SpaceAround [ R u b y T e x t ] <- Spaces around each Ruby text character is equal
 * 
 * [@constant] AVCaptionRubyAlignmentStart
 * Align Ruby base and text at left edge of horizontal text in a left to right inline progression, or at top of the
 * vertical text in a top to bottom inline progression.
 * [@constant] AVCaptionRubyAlignmentCenter
 * Align Ruby text at the center of Ruby base.
 * [@constant] AVCaptionRubyAlignmentDistributeSpaceBetween
 * Align Ruby text so that the spaces between the Ruby text characters are equal. This is the default.
 * [@constant] AVCaptionRubyAlignmentDistributeSpaceAround
 * Align Ruby text so that the spaces around each Ruby text character are equal.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionRubyAlignment {
    @Generated
    private AVCaptionRubyAlignment() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Start = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Center = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long DistributeSpaceBetween = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long DistributeSpaceAround = 0x0000000000000003L;
}