package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class UITabBarControllerMode {
    @Generated
    private UITabBarControllerMode() {
    }

    /**
     * The default tab bar controller mode.
     * Resolves to `tabSidebar` if any of the tab elements of the tab bar controller is a group, and
     * if the platform supports displaying a sidebar mode. Otherwise, resolves to `tabBar`.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Displays tabs in a tab bar.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long TabBar = 0x0000000000000001L;
    /**
     * Displays tabs in a tab bar and sidebar.
     */
    @Generated @NInt public static final long TabSidebar = 0x0000000000000002L;
}