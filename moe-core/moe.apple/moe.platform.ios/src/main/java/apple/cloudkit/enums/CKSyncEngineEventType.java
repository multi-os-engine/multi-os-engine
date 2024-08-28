package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * An event that occurs during the operation of a `CKSyncEngine`.
 * See ``CKSyncEngineEvent`` for more details.
 */
@Generated
public final class CKSyncEngineEventType {
    @Generated
    private CKSyncEngineEventType() {
    }

    /**
     * The sync engine state was updated. You should persist it locally.
     */
    @Generated @NInt public static final long StateUpdate = 0x0000000000000000L;
    /**
     * The user signed in or out of their account.
     */
    @Generated @NInt public static final long AccountChange = 0x0000000000000001L;
    /**
     * The sync engine fetched new database changes from the server.
     */
    @Generated @NInt public static final long FetchedDatabaseChanges = 0x0000000000000002L;
    /**
     * The sync engine fetched new record zone changes from the server.
     */
    @Generated @NInt public static final long FetchedRecordZoneChanges = 0x0000000000000003L;
    /**
     * The sync engine sent a batch of database changes to the server.
     */
    @Generated @NInt public static final long SentDatabaseChanges = 0x0000000000000004L;
    /**
     * The sync engine sent a batch of record zone changes to the server.
     */
    @Generated @NInt public static final long SentRecordZoneChanges = 0x0000000000000005L;
    /**
     * The sync engine is about to fetch changes from the server.
     */
    @Generated @NInt public static final long WillFetchChanges = 0x0000000000000006L;
    /**
     * The sync engine is about to fetch record zone changes from the server for a specific zone.
     */
    @Generated @NInt public static final long WillFetchRecordZoneChanges = 0x0000000000000007L;
    /**
     * The sync engine finished fetching record zone changes from the server for a specific zone.
     */
    @Generated @NInt public static final long DidFetchRecordZoneChanges = 0x0000000000000008L;
    /**
     * The sync engine finished fetching changes from the server.
     */
    @Generated @NInt public static final long DidFetchChanges = 0x0000000000000009L;
    /**
     * The sync engine is about to send changes to the server.
     */
    @Generated @NInt public static final long WillSendChanges = 0x000000000000000AL;
    /**
     * The sync engine finished sending changes to the server.
     */
    @Generated @NInt public static final long DidSendChanges = 0x000000000000000BL;
}