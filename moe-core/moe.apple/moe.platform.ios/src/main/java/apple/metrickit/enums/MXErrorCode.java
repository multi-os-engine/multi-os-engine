package apple.metrickit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MXErrorCode
 * 
 * Error codes for NSError values stemming from the MetricKit Framework.
 * 
 * These error codes are used as the codes for all NSError instances stemmming from the MetricKit Framework.
 * 
 * [@constant] MXErrorLaunchTaskInvalidID The passed-in task ID is a null value or exceeds the max 128 character length.
 * [@constant] MXErrorLaunchTaskMaxCount Exceeded the max number of tasks.
 * [@constant] MXErrorLaunchTaskPastDeadline The start call was made too late, see @discussion.
 * [@constant] MXErrorLaunchTaskDuplicated A task with the same ID has already been started.
 * [@constant] MXErrorLaunchTaskUnknown The task hasn't been started or has already been finished.
 * [@constant] MXErrorLaunchTaskInternalFailure Internal failures happened inside of MetricKit.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MXErrorCode {
    @Generated
    private MXErrorCode() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InvalidID = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MaxCount = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PastDeadline = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Duplicated = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000004L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long InternalFailure = 0x0000000000000005L;
}