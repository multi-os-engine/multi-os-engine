package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class UIImageDynamicRange {
    @Generated
    private UIImageDynamicRange() {
    }

    /**
     * Do not specify a preferred dynamic range.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Unspecified = 0xFFFFFFFFFFFFFFFFL;
    /**
     * Restrict the image content dynamic range to the standard range.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Standard = 0x0000000000000000L;
    /**
     * Allow image content to use some extended range. This is appropriate for mixing content with standard and high
     * dynamic ranges.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long ConstrainedHigh = 0x0000000000000001L;
    /**
     * Allow image content to use unrestricted extended range.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long High = 0x0000000000000002L;
}