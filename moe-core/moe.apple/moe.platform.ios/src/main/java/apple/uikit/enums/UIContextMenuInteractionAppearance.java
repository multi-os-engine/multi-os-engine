package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class UIContextMenuInteractionAppearance {
    @Generated
    private UIContextMenuInteractionAppearance() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Modal "rich" menu with optional preview.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Rich = 0x0000000000000001L;
    /**
     * Non-modal, compact menu with no preview.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Compact = 0x0000000000000002L;
}