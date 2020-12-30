package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UICellAccessoryDisplayedState {
    @Generated
    private UICellAccessoryDisplayedState() {
    }

    /**
     * The accessory is always displayed.
     */
    @Generated @NInt public static final long Always = 0x0000000000000000L;
    /**
     * The accessory is displayed only when the cell is editing.
     */
    @Generated @NInt public static final long WhenEditing = 0x0000000000000001L;
    /**
     * The accessory is displayed only when the cell is not editing.
     */
    @Generated @NInt public static final long WhenNotEditing = 0x0000000000000002L;
}