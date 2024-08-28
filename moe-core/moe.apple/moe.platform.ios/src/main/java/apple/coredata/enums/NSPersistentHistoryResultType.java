package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class NSPersistentHistoryResultType {
    @Generated
    private NSPersistentHistoryResultType() {
    }

    /**
     * Return a status boolean
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long StatusOnly = 0x0000000000000000L;
    /**
     * Return the object IDs of the changes objects
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long ObjectIDs = 0x0000000000000001L;
    /**
     * Return the number of transactions
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Count = 0x0000000000000002L;
    /**
     * Return NSPersistentHistoryTransaction objects
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long TransactionsOnly = 0x0000000000000003L;
    /**
     * Return NSPersistentHistoryChange objects
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long ChangesOnly = 0x0000000000000004L;
    /**
     * Return NSPersistentHistoryTransaction objects with related NSPersistentHistoryChange objects
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long TransactionsAndChanges = 0x0000000000000005L;
}