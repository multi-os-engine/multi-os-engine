package apple.sharedwithyou.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The background styling of SWAttributionView's contents
 * 
 * API-Since: 16.0
 */
@Generated
public final class SWAttributionViewBackgroundStyle {
    @Generated
    private SWAttributionViewBackgroundStyle() {
    }

    /**
     * The default background style, to be chosen by SWAttributionView
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * A non-material background color for the view's contents, best when placed over monochrome backgrounds
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Color = 0x0000000000000001L;
    /**
     * A material background blur for the view's contents, best when placed over multicolored backgrounds
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Material = 0x0000000000000002L;
}