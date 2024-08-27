package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class NSTextLayoutFragmentState {
    @Generated
    private NSTextLayoutFragmentState() {
    }

    /**
     * No layout information
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * When associated with NSTextLayoutManager, filled with an estimated rect if no layout
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long EstimatedUsageBounds = 0x0000000000000001L;
    /**
     * layout fragment measurements available without textLineFragments
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long CalculatedUsageBounds = 0x0000000000000002L;
    /**
     * textLineFragments and layout fragment measurements available
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long LayoutAvailable = 0x0000000000000003L;
}
