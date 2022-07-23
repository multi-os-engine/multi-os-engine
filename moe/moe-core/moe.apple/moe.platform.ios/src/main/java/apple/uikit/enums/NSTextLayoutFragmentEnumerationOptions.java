package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * NSTextLayoutFragment represents the layout fragment typically corresponding to a rendering surface such as CALayer or
 * UIView/NSView subclasses.
 */
@Generated
public final class NSTextLayoutFragmentEnumerationOptions {
    @Generated
    private NSTextLayoutFragmentEnumerationOptions() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long Reverse = 0x0000000000000001L;
    /**
     * When enumerating, the layout fragments will be asked to estimate their size.
     */
    @Generated @NUInt public static final long EstimatesSize = 0x0000000000000002L;
    /**
     * When enumerating, the layout fragments will be asked to layout.
     */
    @Generated @NUInt public static final long EnsuresLayout = 0x0000000000000004L;
    /**
     * It synthesizes the extra line fragment when necessary.
     */
    @Generated @NUInt public static final long EnsuresExtraLineFragment = 0x0000000000000008L;
}
