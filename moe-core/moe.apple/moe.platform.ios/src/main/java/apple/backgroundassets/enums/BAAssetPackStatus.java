package apple.backgroundassets.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The status of an asset pack.
 * 
 * API-Since: 26.0
 */
@Generated
public final class BAAssetPackStatus {
    @Generated
    private BAAssetPackStatus() {
    }

    /**
     * A status value that indicates that the asset pack is available to download.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long DownloadAvailable = 0x0000000000000001L;
    /**
     * A status value that indicates that an update to the asset pack is available to download.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long UpdateAvailable = 0x0000000000000002L;
    /**
     * A status value that indicates that the downloaded asset pack is up to date.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long UpToDate = 0x0000000000000004L;
    /**
     * A status value that indicates that the downloaded asset pack is out of date.
     * 
     * The presence of this status value doesn’t necessarily imply that an update to the asset pack can be downloaded
     * over the current network connection. Check for the presence of ``BAAssetPackStatus/updateAvailable`` to determine
     * whether an update can currently be downloaded.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long OutOfDate = 0x0000000000000008L;
    /**
     * A status value that indicates that the asset pack is no longer available to download.
     * 
     * Obsolete asset packs can’t be updated, and they also can’t be redownloaded once removed.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Obsolete = 0x0000000000000010L;
    /**
     * A status value that indicates that the system is currently downloading the asset pack.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Downloading = 0x0000000000000020L;
    /**
     * A status value that indicates that the system finished downloading the asset pack.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Downloaded = 0x0000000000000040L;
}