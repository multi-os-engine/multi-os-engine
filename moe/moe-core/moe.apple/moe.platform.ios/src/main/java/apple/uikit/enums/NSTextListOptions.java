package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * NSTextList represents a stylistic format of a group of text list items belonging to the same nested level. It
 * supports both ordered and unordered lists. The type of marker is defined by markerFormat.
 */
@Generated
public final class NSTextListOptions {
    @Generated
    private NSTextListOptions() {
    }

    /**
     * All marker strings up to the top-level parent are concatenated to the marker string used by the text list item.
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long NSTextListPrependEnclosingMarker = 0x0000000000000001L;
}