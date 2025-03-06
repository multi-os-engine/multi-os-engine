package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class UITabGroupSidebarAppearance {
    @Generated
    private UITabGroupSidebarAppearance() {
    }

    /**
     * The default appearance showing the group and its children appropriately depending
     * on the group level it is in.
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Displays only the children alongside the group's siblings.
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long Inline = 0x0000000000000001L;
    /**
     * Displays the group and its children as a top-level group of the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated @NUInt public static final long RootSection = 0x0000000000000002L;
}