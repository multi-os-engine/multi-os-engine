package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class UICollectionViewDropIntent {
    @Generated
    private UICollectionViewDropIntent() {
    }

    /**
     * Collection view will accept the drop, but the location is not yet known and will be determined later.
     * Will not open a gap. You may wish to provide some visual treatment to communicate this to the user.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * The drop will be placed in item(s) inserted at the destination index path.
     * Opens a gap at the specified location simulating the final dropped layout.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InsertAtDestinationIndexPath = 0x0000000000000001L;
    /**
     * The drop will be placed inside the item at the destination index path (e.g. the item is a container of other
     * items).
     * Will not open a gap. Collection view will highlight the item at the destination index path.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InsertIntoDestinationIndexPath = 0x0000000000000002L;
}