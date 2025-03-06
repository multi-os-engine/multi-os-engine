package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class UITabPlacement {
    @Generated
    private UITabPlacement() {
    }

    /**
     * Resolves to `.default` for root-level tabs, and `.optional` for all others.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * The tab can be added or removed from the tab bar, and appears by default.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000001L;
    /**
     * The tab can be added or removed from the tab bar, but does NOT appear by default.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Optional = 0x0000000000000002L;
    /**
     * The tab cannot be removed from the tab bar, but can be moved within.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Movable = 0x0000000000000003L;
    /**
     * The tab is always available and visible in the tab bar.
     * Pinned items are placed at the trailing side of the bar.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Pinned = 0x0000000000000004L;
    /**
     * The tab cannot be moved or removed from the tab bar, and is displayed before
     * all customizable tabs.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Fixed = 0x0000000000000005L;
    /**
     * The tab cannot be added to the tab bar.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long SidebarOnly = 0x0000000000000006L;
}