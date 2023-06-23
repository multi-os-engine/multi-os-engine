package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class UIMenuOptions {
    @Generated
    private UIMenuOptions() {
    }

    /**
     * Show children inline in parent, instead of hierarchically
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long DisplayInline = 0x0000000000000001L;
    /**
     * Indicates whether the menu should be rendered with a destructive appearance in its parent
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Destructive = 0x0000000000000002L;
    /**
     * Indicates whether the menu (and any submenus) should only allow a single "on" menu item.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long SingleSelection = 0x0000000000000020L;
}
