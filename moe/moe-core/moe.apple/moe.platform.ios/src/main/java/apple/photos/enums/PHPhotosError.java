package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class PHPhotosError {
    @Generated
    private PHPhotosError() {
    }

    /**
     * DEPRECATED An unknown error occured
     * 
     * API-Since: 13.0
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long Invalid = 0xFFFFFFFFFFFFFFFFL;
    /**
     * The user cancelled the asset resource or editing request
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long UserCancelled = 0x0000000000000C00L;
    /**
     * The photo library is unavailable because the file system volume that contains it is not mounted (register for
     * PHPhotoLibraryAvailabilityObserver)
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long LibraryVolumeOffline = 0x0000000000000C2AL;
    /**
     * The photo library became unavailable because the user moved, renamed, or deleted the system photo library
     * (register for PHPhotoLibraryAvailabilityObserver)
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long RelinquishingLibraryBundleToWriter = 0x0000000000000C46L;
    /**
     * The photo library became unavailable because the user switched the system photo library (register for
     * PHPhotoLibraryAvailabilityObserver)
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long SwitchingSystemPhotoLibrary = 0x0000000000000C47L;
    /**
     * The request for an asset resource failed because network access is required, set networkAccessAllowed = YES to
     * enable network access
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NetworkAccessRequired = 0x0000000000000C5CL;
    /**
     * An unknown, internal error occured
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long InternalError = 0xFFFFFFFFFFFFFFFFL;
    /**
     * Identifier was not found
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long IdentifierNotFound = 0x0000000000000C81L;
    /**
     * More than one identifier was found
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long MultipleIdentifiersFound = 0x0000000000000C82L;
    /**
     * The change request is not supported as configured
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long ChangeNotSupported = 0x0000000000000CE4L;
    /**
     * Operation was interrupted and could not be completed, transient error
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long OperationInterrupted = 0x0000000000000CE5L;
    /**
     * Asset resource validation failed
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long InvalidResource = 0x0000000000000CE6L;
    /**
     * Asset resource missing
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long MissingResource = 0x0000000000000CE7L;
    /**
     * Not enough space to perform the requested change
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long NotEnoughSpace = 0x0000000000000CE9L;
    /**
     * The request could not be completed because it is not supported for the specified asset
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long RequestNotSupportedForAsset = 0x0000000000000CEAL;
    /**
     * Access restricted by system configuration
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long AccessRestricted = 0x0000000000000CEEL;
    /**
     * The user has denied access
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long AccessUserDenied = 0x0000000000000CEFL;
    /**
     * The request for an asset resource failed due to a network connection error
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NetworkError = 0x0000000000000C61L;
    /**
     * The Photos library bundle is in a File Provider Sync Root directory, which is not supported because it can
     * corrupt the photo library
     * 
     * API-Since: 15.4
     */
    @Generated @NInt public static final long LibraryInFileProviderSyncRoot = 0x000000000000152FL;
    /**
     * The change token refers to a library state that is older than the available history of persistent changes
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PersistentChangeTokenExpired = 0x0000000000000C21L;
    /**
     * Change details are not available for this persistent change, and therefore the current library state cannot be
     * reconstructed from change history
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PersistentChangeDetailsUnavailable = 0x0000000000000C8AL;
}
