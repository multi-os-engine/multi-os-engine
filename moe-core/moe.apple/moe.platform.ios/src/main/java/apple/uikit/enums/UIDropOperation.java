package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The UIDropInteraction's delegate uses a UIDropOperation to tell the system
 * what operation it will perform if the user drops.
 * 
 * API-Since: 11.0
 */
@Generated
public final class UIDropOperation {
    @Generated
    private UIDropOperation() {
    }

    /**
     * The drag will be cancelled.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Cancel = 0x0000000000000000L;
    /**
     * The drag will be cancelled.
     * Use this operation to signal that this interaction would *normally* perform
     * a different operation, but that it explicitly forbids a drop at this specific
     * time and place.
     * This may cause a special symbol to be displayed on the drag image.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Forbidden = 0x0000000000000001L;
    /**
     * The data represented by the drag item(s) will be copied.
     * This is the most common operation to use.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Copy = 0x0000000000000002L;
    /**
     * The data represented by the drag item(s) will be moved.
     * 
     * You may use this only if UIDropSession's allowsMoveOperation is true.
     * Otherwise it will be treated as UIDropOperationCancel.
     * 
     * Note that the system does not give any special meaning to this operation.
     * The delegates of both the UIDragInteraction and UIDropInteraction must
     * cooperate to produce the correct result. For instance, the UIDropInteraction's
     * delegate might insert the data in the new location, and the UIDragInteraction's
     * delegate might remove the data from the old location.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Move = 0x0000000000000003L;
}
