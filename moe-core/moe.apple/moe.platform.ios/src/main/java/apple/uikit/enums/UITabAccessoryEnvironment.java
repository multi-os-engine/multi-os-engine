package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class UITabAccessoryEnvironment {
    @Generated
    private UITabAccessoryEnvironment() {
    }

    /**
     * Indicates the absence of any information about whether or not the trait collection is
     * from a view that is in a tab accessory.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * The trait collection is from a view that is not in an active tab accessory environment.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long None = 0x0000000000000001L;
    /**
     * The environment for when the accessory is laid out either:
     * - above the bottom tab bar when it is visible; or,
     * - at the bottom of the UITabBarController's view.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Regular = 0x0000000000000002L;
    /**
     * The environment for when the accessory is laid out inline with
     * the collapsed bottom tab bar.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Inline = 0x0000000000000003L;
}