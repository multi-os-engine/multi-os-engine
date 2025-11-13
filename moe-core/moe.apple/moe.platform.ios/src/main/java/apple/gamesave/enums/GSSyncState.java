package apple.gamesave.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class GSSyncState {
    @Generated
    private GSSyncState() {
    }

    /**
     * The directory is fully synced and ready to use.
     * 
     * In this state, the value of ``GSSyncedDirectoryState/url`` is nonnull.
     */
    @Generated @NInt public static final long Ready = 0x0000000000000000L;
    /**
     * The directory is available locally, but not fully synced because the device is offline.
     * 
     * In this state, the value of ``GSSyncedDirectoryState/url`` is nonnull.
     */
    @Generated @NInt public static final long Offline = 0x0000000000000001L;
    /**
     * The directory is local-only and not synced to iCloud.
     * 
     * In this state, the value of ``GSSyncedDirectoryState/url`` is nonnull.
     */
    @Generated @NInt public static final long Local = 0x0000000000000002L;
    /**
     * The directory is currently syncing and is not ready yet.
     */
    @Generated @NInt public static final long Syncing = 0x0000000000000003L;
    /**
     * The directory has conflicts with the cloud, which the game needs to resolve.
     * 
     * In this state, the value of ``GSSyncedDirectoryState/conflictedVersions`` is nonnull.
     */
    @Generated @NInt public static final long Conflicted = 0x0000000000000004L;
    /**
     * The directory is in error state and can't be used.
     * 
     * In this state, the value of ``GSSyncedDirectoryState/error`` is nonnull.
     */
    @Generated @NInt public static final long Error = 0x0000000000000005L;
    /**
     * The directory is closed.
     */
    @Generated @NInt public static final long Closed = 0x0000000000000006L;
}