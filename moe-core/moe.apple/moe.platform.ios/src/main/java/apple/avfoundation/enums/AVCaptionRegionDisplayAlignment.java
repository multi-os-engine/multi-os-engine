package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptionRegionDisplayAlignment
 * 
 * Choices for region display alignment
 * 
 * Whenever a caption line is inserted into a region, it's placed relative to the existing lines and the direction to
 * which the line is placed is called the block progression direction of the region. For example, English caption's
 * block progression direction is top-to-bottom, while Japanese vertical caption uses right-to-left.
 * 
 * The value describes how the caption lines should positioned in a region in terms of the block progression direction.
 * 
 * [@constant] AVCaptionRegionDisplayAlignmentBefore
 * Align lines in earlier position in the block progression direction, or align to the top for English captions, for
 * example.
 * 
 * [@constant] AVCaptionRegionDisplayAlignmentCenter
 * Align lines in center position in the block progression direction. iTT doesn't support this.
 * 
 * [@constant] AVCaptionRegionDisplayAlignmentAfter
 * Align lines in later position in the block progression direction, or align to the left for Japanese vertical
 * captions, for example.
 * 
 * API-Since: 18.0
 */
@Generated
public final class AVCaptionRegionDisplayAlignment {
    @Generated
    private AVCaptionRegionDisplayAlignment() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Before = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Center = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long After = 0x0000000000000002L;
}