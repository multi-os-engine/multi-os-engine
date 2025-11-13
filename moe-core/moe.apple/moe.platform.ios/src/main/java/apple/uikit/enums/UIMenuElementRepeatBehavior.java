package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Possible repeat behaviors for a menu element.
 * 
 * API-Since: 26.0
 */
@Generated
public final class UIMenuElementRepeatBehavior {
    @Generated
    private UIMenuElementRepeatBehavior() {
    }

    /**
     * Automatically uses the appropriate repeat behavior for this element.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * The element should be allowed to repeat.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Repeatable = 0x0000000000000001L;
    /**
     * The element should not be repeatable.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NonRepeatable = 0x0000000000000002L;
}