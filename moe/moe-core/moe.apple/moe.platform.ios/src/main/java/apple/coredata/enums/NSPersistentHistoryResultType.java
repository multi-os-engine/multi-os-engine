package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSPersistentHistoryResultType {
    @Generated
    private NSPersistentHistoryResultType() {
    }

    @Generated @NInt public static final long StatusOnly = 0x0000000000000000L;
    @Generated @NInt public static final long ObjectIDs = 0x0000000000000001L;
    @Generated @NInt public static final long Count = 0x0000000000000002L;
    @Generated @NInt public static final long TransactionsOnly = 0x0000000000000003L;
    @Generated @NInt public static final long ChangesOnly = 0x0000000000000004L;
    @Generated @NInt public static final long TransactionsAndChanges = 0x0000000000000005L;
}