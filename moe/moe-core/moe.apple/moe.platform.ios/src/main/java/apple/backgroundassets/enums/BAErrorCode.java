package apple.backgroundassets.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] Background Assets error codes.
 * [@constant] BAErrorCodeDownloadInvalid Invalid error code.
 * [@constant] BAErrorCodeCallFromExtensionNotAllowed Calling this method from the download extension is not allowed.
 * [@constant] BAErrorCodeCallFromInactiveProcessNotAllowed Calling this method from an inactive process is not allowed.
 * [@constant] BAErrorCodeCallerConnectionNotAccepted This operation cannot be performed because the caller is not
 * accepted based on its application or extension identifier.
 * [@constant] BAErrorCodeCallerConnectionInvalid This operation cannot be performed because the connection to the
 * background asset system service is invalid.
 * [@constant] BAErrorCodeDownloadAlreadyScheduled A download with the requested identifier has already been scheduled.
 * [@constant] BAErrorCodeDownloadNotScheduled The requested download is not scheduled.
 * [@constant] BAErrorCodeDownloadFailedToStart The requested download failed to start.
 * [@constant] BAErrorCodeDownloadAlreadyFailed The requested download has failed.
 * [@constant] BAErrorCodeDownloadEssentialDownloadNotPermitted The requested download could not be enqueued because the
 * download is marked as essential, which is prohibited in this context.
 * [@constant] BAErrorCodeDownloadBackgroundActivityProhibited The requested download could not be enqueued. Check the
 * device‘s Low Power Mode or Background App Refresh settings.
 * [@constant] BAErrorCodeDownloadWouldExceedAllowance The requested download cannot be enqueued. The download would
 * exceed the download allowance.
 * [@constant] BAErrorCodeSessionDownloadDisallowedByDomain The requested URL is not permitted to be downloaded until
 * the application is launched.
 * [@constant] BAErrorCodeSessionDownloadDisallowedByAllowance The requested download will not be allowed due to running
 * out of download allowance.
 * [@constant] BAErrorCodeSessionDownloadAllowanceExceeded The requested download failed because the download allowance
 * has been exceeded.
 * [@constant] BAErrorCodeSessionDownloadNotPermittedBeforeAppLaunch The requested download cannot be scheduled before
 * the app has been launched.
 * 
 * API-Since: 17.0
 */
@Generated
public final class BAErrorCode {
    @Generated
    private BAErrorCode() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadInvalid = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CallFromExtensionNotAllowed = 0x0000000000000032L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CallFromInactiveProcessNotAllowed = 0x0000000000000033L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CallerConnectionNotAccepted = 0x0000000000000037L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long CallerConnectionInvalid = 0x0000000000000038L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadAlreadyScheduled = 0x0000000000000064L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadNotScheduled = 0x0000000000000065L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadFailedToStart = 0x0000000000000066L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadAlreadyFailed = 0x0000000000000067L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadEssentialDownloadNotPermitted = 0x000000000000006DL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadBackgroundActivityProhibited = 0x000000000000006FL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long DownloadWouldExceedAllowance = 0x0000000000000070L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SessionDownloadDisallowedByDomain = 0x00000000000000CAL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SessionDownloadDisallowedByAllowance = 0x00000000000000CBL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SessionDownloadAllowanceExceeded = 0x00000000000000CCL;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SessionDownloadNotPermittedBeforeAppLaunch = 0x00000000000000CEL;
}