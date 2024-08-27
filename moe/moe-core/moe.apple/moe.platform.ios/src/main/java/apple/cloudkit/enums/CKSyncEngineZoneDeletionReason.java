package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CKSyncEngineZoneDeletionReason {
    @Generated
    private CKSyncEngineZoneDeletionReason() {
    }

    /**
     * A deletion from your software.
     */
    @Generated @NInt public static final long Deleted = 0x0000000000000000L;
    /**
     * A deletion from the user via the iCloud storage UI.
     * This is an indication that the user wanted all data deleted, so local cached data should be wiped and not
     * re-uploaded to the server.
     */
    @Generated @NInt public static final long Purged = 0x0000000000000001L;
    /**
     * The user chose to reset all encrypted data for their account.
     * This is an indication that the user had to reset encrypted data during account recovery, so local cached data
     * should be re-uploaded to the server to minimize data loss.
     */
    @Generated @NInt public static final long EncryptedDataReset = 0x0000000000000002L;
}