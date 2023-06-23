package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * NSTextLayoutFragment represents the layout fragment typically corresponding to a rendering surface such as CALayer or
 * UIView/NSView subclasses.
 * 
 * API-Since: 15.0
 */
@Generated
public final class NSTextLayoutFragmentEnumerationOptions {
    @Generated
    private NSTextLayoutFragmentEnumerationOptions() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Reverse = 0x0000000000000001L;
    /**
     * When enumerating, the layout fragments will be asked to estimate their size.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long EstimatesSize = 0x0000000000000002L;
    /**
     * When enumerating, the layout fragments will be asked to layout.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long EnsuresLayout = 0x0000000000000004L;
    /**
     * It synthesizes the extra line fragment when necessary.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long EnsuresExtraLineFragment = 0x0000000000000008L;
}
