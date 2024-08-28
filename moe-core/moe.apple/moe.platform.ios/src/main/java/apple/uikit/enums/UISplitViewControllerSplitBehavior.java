package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Allowed displayModes depend on the splitBehavior
 * Tile behavior allows SecondaryOnly, OneBesideSecondary, and TwoBesideSecondary display modes
 * Overlay behavior allows SecondaryOnly, OneOverSecondary, and TwoOverSecondary display modes
 * Displace behavior allows SecondaryOnly, OneBesideSecondary, and TwoDisplaceSecondary display modes
 * 
 * API-Since: 14.0
 */
@Generated
public final class UISplitViewControllerSplitBehavior {
    @Generated
    private UISplitViewControllerSplitBehavior() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Tile = 0x0000000000000001L;
    @Generated @NInt public static final long Overlay = 0x0000000000000002L;
    @Generated @NInt public static final long Displace = 0x0000000000000003L;
}