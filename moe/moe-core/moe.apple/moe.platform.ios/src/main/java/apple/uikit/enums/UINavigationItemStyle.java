package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UINavigationItemStyle {
    @Generated
    private UINavigationItemStyle() {
    }

    /**
     * Traditional navigation bar behavior. Center items are placed in the overflow menu.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Navigator = 0x0000000000000000L;
    /**
     * A style designed for use as a browser. Title is leading aligned, center items are displayed. Typically used with
     * history-based navigation.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Browser = 0x0000000000000001L;
    /**
     * A style designed for use as an editor. The back button will always present as chevron-only, title is leading
     * aligned, center items are displayed. Typically used without navigation.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Editor = 0x0000000000000002L;
}