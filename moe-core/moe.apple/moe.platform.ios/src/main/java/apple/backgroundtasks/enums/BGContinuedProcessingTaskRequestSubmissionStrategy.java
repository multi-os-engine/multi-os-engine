package apple.backgroundtasks.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class BGContinuedProcessingTaskRequestSubmissionStrategy {
    @Generated
    private BGContinuedProcessingTaskRequestSubmissionStrategy() {
    }

    /**
     * Fail the submission if there is no room for the task request, or if the system is under substantial load and is
     * unable immediately run the task.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Fail = 0x0000000000000000L;
    /**
     * Add the request to the back of a queue if there is no room for the submitted task or if the system is under
     * substantial load and is unable to immediately run the task. Queued ``BGContinuedProcessingTaskRequest``s will be
     * cancelled when the user removes your app from the app switcher.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Queue = 0x0000000000000001L;
}