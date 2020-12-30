package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UICellAccessoryOutlineDisclosureStyle {
    @Generated
    private UICellAccessoryOutlineDisclosureStyle() {
    }

    /**
     * The style will be automatically determined based on whether the cell is configured to be a section header or not.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * A style appropriate for a section header, where a tap anywhere in the header will toggle the expansion state
     * of the item (the cell cannot be selected).
     */
    @Generated @NInt public static final long Header = 0x0000000000000001L;
    /**
     * A style appropriate for a cell which can be selected itself and also has nested children, where only taps on the
     * outline disclosure will toggle the expansion state of the item; taps on the cell will select the item as normal.
     */
    @Generated @NInt public static final long Cell = 0x0000000000000002L;
}