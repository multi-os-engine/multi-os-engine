package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class UITabBarControllerSidebarLayout {
    @Generated
    private UITabBarControllerSidebarLayout() {
    }

    /**
     * On iOS, this resolves to `overlap`.
     * On macOS and visionOS, this resolves to `tile`.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * When the sidebar is displayed, it will overlap the selected view controller,
     * allowing the selected view controller to render underneath the sidebar. Anchor
     * the view's content to the `layoutMarginsGuide` or `safeAreaLayoutGuide` to avoid
     * being occluded by the sidebar.
     */
    @Generated @NInt public static final long Overlap = 0x0000000000000001L;
    /**
     * When the sidebar is displayed, the selected view controller is resized and shifted
     * to display alongside the sidebar. The selected view controller is not occluded by
     * the sidebar, cannot render underneath the sidebar.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Tile = 0x0000000000000002L;
}