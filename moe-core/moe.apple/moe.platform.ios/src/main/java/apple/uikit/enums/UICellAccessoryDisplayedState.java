package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class UICellAccessoryDisplayedState {
    @Generated
    private UICellAccessoryDisplayedState() {
    }

    /**
     * The accessory is always displayed.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Always = 0x0000000000000000L;
    /**
     * The accessory is displayed only when the cell is editing.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long WhenEditing = 0x0000000000000001L;
    /**
     * The accessory is displayed only when the cell is not editing.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long WhenNotEditing = 0x0000000000000002L;
}