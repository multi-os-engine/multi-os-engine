package apple.sharedwithyou.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The horizontal alignment of SWAttributionView's contents
 * 
 * API-Since: 16.0
 */
@Generated
public final class SWAttributionViewHorizontalAlignment {
    @Generated
    private SWAttributionViewHorizontalAlignment() {
    }

    /**
     * The default horizontal alignment, to be chosen by SWAttributionView
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Horizontally align with the leading edge of the view (depends on the user interface layout direction)
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Leading = 0x0000000000000001L;
    /**
     * Horizontally align with the center of the view
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Center = 0x0000000000000002L;
    /**
     * Horizontally align with the trailing edge of the view (depends on the user interface layout direction)
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Trailing = 0x0000000000000003L;
}