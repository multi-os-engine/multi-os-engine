package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CKSyncEngineSyncReason {
    @Generated
    private CKSyncEngineSyncReason() {
    }

    /**
     * This sync was scheduled automatically by the sync engine.
     */
    @Generated @NInt public static final long Scheduled = 0x0000000000000000L;
    /**
     * This sync was requested manually by calling `fetchChanges` or `sendChanges`.
     */
    @Generated @NInt public static final long Manual = 0x0000000000000001L;
}