package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UICellConfigurationDragState {
    @Generated
    private UICellConfigurationDragState() {
    }

    /**
     * The cell is not associated with a drag session.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The cell is being lifted, before has joined a drag session.
     */
    @Generated @NInt public static final long Lifting = 0x0000000000000001L;
    /**
     * The cell is part of an active drag session.
     */
    @Generated @NInt public static final long Dragging = 0x0000000000000002L;
}