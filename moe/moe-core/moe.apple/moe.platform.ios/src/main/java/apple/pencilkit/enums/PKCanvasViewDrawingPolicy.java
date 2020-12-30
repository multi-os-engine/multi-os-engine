package apple.pencilkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class PKCanvasViewDrawingPolicy {
    @Generated
    private PKCanvasViewDrawingPolicy() {
    }

    /**
     * Default is: if a `PKToolPicker` is visible, respect `UIPencilInteraction.prefersPencilOnlyDrawing`,
     * otherwise only pencil touches draw.
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Default is: if a `PKToolPicker` is visible, respect `UIPencilInteraction.prefersPencilOnlyDrawing`,
     * otherwise only pencil touches draw.
     */
    @Generated @NUInt public static final long AnyInput = 0x0000000000000001L;
    /**
     * Default is: if a `PKToolPicker` is visible, respect `UIPencilInteraction.prefersPencilOnlyDrawing`,
     * otherwise only pencil touches draw.
     */
    @Generated @NUInt public static final long PencilOnly = 0x0000000000000002L;
}