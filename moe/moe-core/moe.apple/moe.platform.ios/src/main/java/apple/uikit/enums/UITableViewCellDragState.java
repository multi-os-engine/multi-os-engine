package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UITableViewCellDragState {
    @Generated
    private UITableViewCellDragState() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The cell is lifting from the table view before it joins the drag session.
     */
    @Generated @NInt public static final long Lifting = 0x0000000000000001L;
    /**
     * The cell is involved in a drag session.
     */
    @Generated @NInt public static final long Dragging = 0x0000000000000002L;
}