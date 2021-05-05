package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSBatchInsertRequestResultType {
    @Generated
    private NSBatchInsertRequestResultType() {
    }

    /**
     * Return a status boolean
     */
    @Generated @NUInt public static final long StatusOnly = 0x0000000000000000L;
    /**
     * Return the object IDs of the rows that were inserted/updated
     */
    @Generated @NUInt public static final long ObjectIDs = 0x0000000000000001L;
    /**
     * Return the number of rows that were inserted/updated
     */
    @Generated @NUInt public static final long Count = 0x0000000000000002L;
}