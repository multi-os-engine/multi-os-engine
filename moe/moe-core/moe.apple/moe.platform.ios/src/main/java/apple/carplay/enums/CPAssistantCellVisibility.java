package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Visibility of the Assistant Cell
 */
@Generated
public final class CPAssistantCellVisibility {
    @Generated
    private CPAssistantCellVisibility() {
    }

    /**
     * The list template will render without an assistant cell.
     */
    @Generated @NInt public static final long Off = 0x0000000000000000L;
    /**
     * The list template will render with an assistant cell, only while Limited UI is active.
     */
    @Generated @NInt public static final long WhileLimitedUIActive = 0x0000000000000001L;
    /**
     * the list template will render with an assistant cell at all times.
     */
    @Generated @NInt public static final long Always = 0x0000000000000002L;
}
