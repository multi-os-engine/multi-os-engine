package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class UITabBarMinimizeBehavior {
    @Generated
    private UITabBarMinimizeBehavior() {
    }

    /**
     * Resolves to the system default minimize behavior.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * The tab bar does not minimize.
     */
    @Generated @NInt public static final long Never = 0x0000000000000001L;
    /**
     * The tab bar minimizes when scrolling down, and expands when scrolling back up.
     */
    @Generated @NInt public static final long OnScrollDown = 0x0000000000000002L;
    /**
     * The tab bar minimizes when scrolling up, and expands when scrolling back down.
     * Recommended if the scroll view content is aligned to the bottom.
     */
    @Generated @NInt public static final long OnScrollUp = 0x0000000000000003L;
}