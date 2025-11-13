package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UINavigationItemSearchBarPlacement {
    @Generated
    private UINavigationItemSearchBarPlacement() {
    }

    /**
     * The navigation bar will choose a placement for the search bar that is appropriate for the current layout
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Placement is the same as Integrated, except that the inactive search bar is always shown as a button even when
     * space permits a search field.
     * 
     * API-Since: 16.0
     * Deprecated-Since: 26.0
     */
    @Deprecated @Generated @NInt public static final long Inline = 0x0000000000000001L;
    /**
     * The navigation bar will place the search bar vertically stacked with other content.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Stacked = 0x0000000000000002L;
    /**
     * The navigation bar will place the search bar inline with other content, on the trailing edge.
     * On iPhone, when the navigation bar belongs to a UINavigationController, the search bar may be integrated into the
     * toolbar.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Integrated = 0x0000000000000001L;
    /**
     * Placement is the same as Integrated, except that in regular width on iPad, the search bar is centered in the
     * navigation bar.
     * Only respected when used in a view controller that is a descendant of a tab bar controller or when using a
     * navigation item style that requires a leading aligned title
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long IntegratedCentered = 0x0000000000000003L;
    /**
     * Placement is the same as Integrated, except that the inactive search bar is always shown as a button even when
     * space permits a search field.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long IntegratedButton = 0x0000000000000004L;
}