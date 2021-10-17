package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Position of the Assistant Cell
 */
@Generated
public final class CPAssistantCellPosition {
    @Generated
    private CPAssistantCellPosition() {
    }

    /**
     * The list template will display the assistant cell at the top of all visible cells.
     */
    @Generated @NInt public static final long Top = 0x0000000000000000L;
    /**
     * The list template will display the assistant cell at the bottom of all visible cells.
     */
    @Generated @NInt public static final long Bottom = 0x0000000000000001L;
}
