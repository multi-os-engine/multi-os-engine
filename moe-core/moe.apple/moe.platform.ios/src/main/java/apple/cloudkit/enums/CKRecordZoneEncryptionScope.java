package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CKRecordZoneEncryptionScope {
    @Generated
    private CKRecordZoneEncryptionScope() {
    }

    /**
     * Zone uses per-record encryption keys for any encrypted values on a record or share.
     * 
     * This is the default encryption scope for a record zone.
     */
    @Generated @NInt public static final long Record = 0x0000000000000000L;
    /**
     * Zone uses per-zone encryption keys for encrypted values across all records and the zone-wide share, if present.
     * 
     * This is an optional optimization that can reduce the overall storage used by encryption keys in a zone.
     * Note that:
     * - Record zones using per-zone encryption only support zone-wide sharing.
     * - Encryption scope can only be assigned at zone creation and cannot be changed for the lifetime of the zone.
     * - The server will not return zones using per-zone encryption to device OS versions older than the corresponding
     * API availability version.
     * - An older OS trying to overwrite an existing zone using per-zone encryption due to a naming collision will
     * result in a `.serverRejectedRequest` error.
     * - On device OS upgrade, your application is responsible for fetching database changes via
     * `CKFetchDatabaseChangesOperation` with a nil sync token to ensure it has
     * received all the zones available to it from the server.
     */
    @Generated @NInt public static final long Zone = 0x0000000000000001L;
}