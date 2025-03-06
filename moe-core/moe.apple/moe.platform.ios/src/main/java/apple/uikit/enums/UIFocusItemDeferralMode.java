package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class UIFocusItemDeferralMode {
    @Generated
    private UIFocusItemDeferralMode() {
    }

    /**
     * Use the system default behavior.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Always defer focus for this item, even if deferral is disabled right now.
     * This means a programmatic update to this item would result in focus
     * disappearing until the user interacts with the focus engine again.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Always = 0x0000000000000001L;
    /**
     * Never defer focus for this item. When a programmatic focus update
     * lands on this item, it will always be and appear focused even if focus
     * deferral is currently enabled.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Never = 0x0000000000000002L;
}