package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UISearchControllerScopeBarActivation {
    @Generated
    private UISearchControllerScopeBarActivation() {
    }

    /**
     * System-defined automatic showing and hiding of the scope bar
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Showing and hiding the scope bar will be controlled by client code through the `showsScopeBar` API on the
     * UISearchController's `searchBar`
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Manual = 0x0000000000000001L;
    /**
     * The search controller shows the scope bar when typing begins in the search field, and hides it when search is
     * cancelled
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long OnTextEntry = 0x0000000000000002L;
    /**
     * The search controller shows the scope bar when search becomes active, and hides it when search is cancelled
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long OnSearchActivation = 0x0000000000000003L;
}