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
     * The navigation bar will place the search bar inline with other content, on the trailing edge.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Inline = 0x0000000000000001L;
    /**
     * The navigation bar will place the search bar vertically stacked with other content.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Stacked = 0x0000000000000002L;
}