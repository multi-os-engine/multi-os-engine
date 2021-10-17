package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSTextSelectionNavigationModifier {
    @Generated
    private NSTextSelectionNavigationModifier() {
    }

    /**
     * Extends the selection by not moving the initial location while drag selection
     */
    @Generated @NUInt public static final long Extend = 0x0000000000000001L;
    /**
     * Extends the selection visually inside the rectangular area defined by the anchor and dragged positions
     */
    @Generated @NUInt public static final long Visual = 0x0000000000000002L;
    /**
     * Extends the selection visually inside the rectangular area defined by the anchor and dragged positions and produces an NSTextSelection per line
     */
    @Generated @NUInt public static final long Multiple = 0x0000000000000004L;
}
