package apple.backgroundtasks.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] BGTaskSchedulerErrorCode
 * [@constant] BGTaskSchedulerErrorCodeUnavailable Background task scheduling functionality is not available for this
 * app/extension. Background App Refresh may have been disabled in Settings.
 * [@constant] BGTaskSchedulerErrorCodeTooManyPendingTaskRequests The task request could not be submitted because there
 * are too many pending task requests of this type. Cancel some existing task requests before trying again.
 * [@constant] BGTaskSchedulerErrorCodeNotPermitted The task request could not be submitted because the appropriate
 * background mode is not included in the UIBackgroundModes array, or its identifier was not present in the
 * BGTaskSchedulerPermittedIdentifiers array in the app's Info.plist.
 * 
 * API-Since: 13.0
 */
@Generated
public final class BGTaskSchedulerErrorCode {
    @Generated
    private BGTaskSchedulerErrorCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Unavailable = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long TooManyPendingTaskRequests = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NotPermitted = 0x0000000000000003L;
}