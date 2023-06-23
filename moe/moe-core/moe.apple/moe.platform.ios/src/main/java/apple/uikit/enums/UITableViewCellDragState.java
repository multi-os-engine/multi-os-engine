package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class UITableViewCellDragState {
    @Generated
    private UITableViewCellDragState() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The cell is lifting from the table view before it joins the drag session.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Lifting = 0x0000000000000001L;
    /**
     * The cell is involved in a drag session.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Dragging = 0x0000000000000002L;
}