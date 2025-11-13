package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class UIMenuSystemElementGroupPreference {
    @Generated
    private UIMenuSystemElementGroupPreference() {
    }

    /**
     * The default preference. The element group is automatically included based on the platform and other system
     * behaviors.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Prefer that the element group is removed.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Removed = 0x0000000000000001L;
    /**
     * Prefer that the element group is included.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Included = 0x0000000000000002L;
}