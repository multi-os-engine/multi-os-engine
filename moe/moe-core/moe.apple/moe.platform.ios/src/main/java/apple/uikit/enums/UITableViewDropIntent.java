package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UITableViewDropIntent {
    @Generated
    private UITableViewDropIntent() {
    }

    /**
     * Table view will accept the drop, but the location is not yet known and will be determined later.
     * Will not open a gap. You may wish to provide some visual treatment to communicate this to the user.
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * The drop will be placed in row(s) inserted at the destination index path.
     * Opens a gap at the specified location simulating the final dropped layout.
     */
    @Generated @NInt public static final long InsertAtDestinationIndexPath = 0x0000000000000001L;
    /**
     * The drop will be placed inside the row at the destination index path (e.g. the row is a container of other items).
     * Will not open a gap. Table view will highlight the row at the destination index path.
     */
    @Generated @NInt public static final long InsertIntoDestinationIndexPath = 0x0000000000000002L;
    /**
     * The table view will automatically choose between .insertAtDestinationIndexPath and
     * .insertIntoDestinationIndexPath depending on the position of the drop. This should be used instead
     * of .insertIntoDestinationIndexPath when the item being dropped can either be placed inside the row
     * at the destination index path or inserted in a new row at the index path of the container row.
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000003L;
}