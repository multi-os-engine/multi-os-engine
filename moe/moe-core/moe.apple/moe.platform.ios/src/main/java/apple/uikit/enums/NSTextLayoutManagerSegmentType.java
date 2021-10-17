package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSTextLayoutManagerSegmentType {
    @Generated
    private NSTextLayoutManagerSegmentType() {
    }

    /**
     * The standard segment matching the typographic bounds of range.
     */
    @Generated @NInt public static final long Standard = 0x0000000000000000L;
    /**
     * The segment behavior suitable for the selection rendering. Extends the last segment in a line fragment to the trailing edge if continuing to the next line.
     */
    @Generated @NInt public static final long Selection = 0x0000000000000001L;
    /**
     * The segment behavior suitable for highlighting.
     */
    @Generated @NInt public static final long Highlight = 0x0000000000000002L;
}
