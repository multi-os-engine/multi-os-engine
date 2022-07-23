package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PHPhotosError {
    @Generated
    private PHPhotosError() {
    }

    /**
     * DEPRECATED An unknown error occured
     */
    @Generated @NInt public static final long Invalid = 0xFFFFFFFFFFFFFFFFL;
    /**
     * The user cancelled the asset resource or editing request
     */
    @Generated @NInt public static final long UserCancelled = 0x0000000000000C00L;
    /**
     * The photo library is unavailable because the file system volume that contains it is not mounted (register for
     * PHPhotoLibraryAvailabilityObserver)
     */
    @Generated @NInt public static final long LibraryVolumeOffline = 0x0000000000000C2AL;
    /**
     * The photo library became unavailable because the user moved, renamed, or deleted the system photo library
     * (register for PHPhotoLibraryAvailabilityObserver)
     */
    @Generated @NInt public static final long RelinquishingLibraryBundleToWriter = 0x0000000000000C46L;
    /**
     * The photo library became unavailable because the user switched the system photo library (register for
     * PHPhotoLibraryAvailabilityObserver)
     */
    @Generated @NInt public static final long SwitchingSystemPhotoLibrary = 0x0000000000000C47L;
    /**
     * The request for an asset resource failed because network access is required, set networkAccessAllowed = YES to
     * enable network access
     */
    @Generated @NInt public static final long NetworkAccessRequired = 0x0000000000000C5CL;
    /**
     * An unknown, internal error occured
     */
    @Generated @NInt public static final long InternalError = 0xFFFFFFFFFFFFFFFFL;
    /**
     * Identifier was not found
     */
    @Generated @NInt public static final long IdentifierNotFound = 0x0000000000000C81L;
    /**
     * More than one identifier was found
     */
    @Generated @NInt public static final long MultipleIdentifiersFound = 0x0000000000000C82L;
    /**
     * The change request is not supported as configured
     */
    @Generated @NInt public static final long ChangeNotSupported = 0x0000000000000CE4L;
    /**
     * Operation was interrupted and could not be completed, transient error
     */
    @Generated @NInt public static final long OperationInterrupted = 0x0000000000000CE5L;
    /**
     * Asset resource validation failed
     */
    @Generated @NInt public static final long InvalidResource = 0x0000000000000CE6L;
    /**
     * Asset resource missing
     */
    @Generated @NInt public static final long MissingResource = 0x0000000000000CE7L;
    /**
     * Not enough space to perform the requested change
     */
    @Generated @NInt public static final long NotEnoughSpace = 0x0000000000000CE9L;
    /**
     * The request could not be completed because it is not supported for the specified asset
     */
    @Generated @NInt public static final long RequestNotSupportedForAsset = 0x0000000000000CEAL;
    /**
     * Access restricted by system configuration
     */
    @Generated @NInt public static final long AccessRestricted = 0x0000000000000CEEL;
    /**
     * The user has denied access
     */
    @Generated @NInt public static final long AccessUserDenied = 0x0000000000000CEFL;
}
