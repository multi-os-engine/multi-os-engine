package apple.backgroundtasks.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * An enumeration of the task scheduling errors.
 * 
 * API-Since: 13.0
 */
@Generated
public final class BGTaskSchedulerErrorCode {
    @Generated
    private BGTaskSchedulerErrorCode() {
    }

    /**
     * A task scheduling error indicating that the app or extension can’t schedule background work.
     * 
     * This error usually occurs for one of following reasons:
     * 
     * - The user has disabled background refresh in settings.
     * - The app is running on Simulator which doesn’t support background processing.
     * - The keyboard extension either hasn’t set
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list/nsextension/nsextensionattributes/requestsopenaccess>
     * to `YES` in [The Info.plist
     * File](https://developer.apple.com/library/archive/documentation/Carbon/Conceptual/ProvidingUserAssitAppleHelp/authoring_help/authoring_help_book.html#//apple_ref/doc/uid/TP30000903-CH206-SW22),
     * or the user hasn’t granted open access.
     * - The extension type isn’t able to schedule background tasks.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Unavailable = 0x0000000000000001L;
    /**
     * A task scheduling error indicating that there are too many pending tasks of the type requested.
     * 
     * Try canceling some existing task requests and then resubmit the request that failed.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long TooManyPendingTaskRequests = 0x0000000000000002L;
    /**
     * A task scheduling error indicating the app isn’t permitted to schedule the task.
     * 
     * There are four causes for this error:
     * 
     * - The app doesn’t set the appropriate mode in the
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list/uibackgroundmodes>
     * array.
     * - The task identifier of the submitted task wasn’t in the
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list/bgtaskschedulerpermittedidentifiers>
     * array in [the
     * Info.plist](https://developer.apple.com/library/archive/documentation/Carbon/Conceptual/ProvidingUserAssitAppleHelp/authoring_help/authoring_help_book.html#//apple_ref/doc/uid/TP30000903-CH206-SW22).
     * - The task requested additional ``BGContinuedProcessingTaskRequestResources`` that are unavailable.
     * - The user has explicitly denied background launches for your app.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NotPermitted = 0x0000000000000003L;
    /**
     * A ``BGContinuedProcessingTaskRequest`` was not allowed to immediately run due to system conditions.
     * 
     * This will only be returned when using the ``BGContinuedProcessingTaskRequestSubmissionStrategyFail`` when
     * submitting a ``BGContinuedProcessingTaskRequest``. Task requests that are successfully ran will not be
     * associated with any error code.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ImmediateRunIneligible = 0x0000000000000004L;
}