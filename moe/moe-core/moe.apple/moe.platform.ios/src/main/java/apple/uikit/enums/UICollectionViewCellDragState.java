package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class UICollectionViewCellDragState {
    @Generated
    private UICollectionViewCellDragState() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The cell is in the "lifting" state.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Lifting = 0x0000000000000001L;
    /**
     * A cell in the "dragging" state is left behind with a
     * "ghosted" appearance to denote where the drag
     * started from.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Dragging = 0x0000000000000002L;
}