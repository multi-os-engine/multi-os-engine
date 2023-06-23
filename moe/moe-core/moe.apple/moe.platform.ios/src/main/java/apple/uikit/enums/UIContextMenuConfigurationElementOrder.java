package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UIContextMenuConfigurationElementOrder {
    @Generated
    private UIContextMenuConfigurationElementOrder() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Allows the system to choose the appropriate ordering strategy for the current context.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Priority = 0x0000000000000001L;
    /**
     * Order menu elements according to priority. Keeping the first element in the UIMenu closest to user's interaction
     * point.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Fixed = 0x0000000000000002L;
}