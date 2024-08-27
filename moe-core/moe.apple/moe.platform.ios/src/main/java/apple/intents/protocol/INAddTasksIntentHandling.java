package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INAddTasksIntent;
import apple.intents.INAddTasksIntentResponse;
import apple.intents.INAddTasksTargetTaskListResolutionResult;
import apple.intents.INAddTasksTemporalEventTriggerResolutionResult;
import apple.intents.INSpatialEventTriggerResolutionResult;
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INTaskListResolutionResult;
import apple.intents.INTaskPriorityResolutionResult;
import apple.intents.INTemporalEventTriggerResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * Protocol to declare support for handling an INAddTasksIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INAddTasksIntentHandling")
public interface INAddTasksIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INAddTasksIntentResponse containing additional details about the
     *                   intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INAddTasksIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmAddTasks:completion:")
    default void confirmAddTasksCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmAddTasksCompletion") Block_confirmAddTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmAddTasksCompletion {
        @Generated
        void call_confirmAddTasksCompletion(@NotNull INAddTasksIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INAddTasksIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INAddTasksIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INAddTasksIntentResponse
     */
    @Generated
    @Selector("handleAddTasks:completion:")
    void handleAddTasksCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_handleAddTasksCompletion") Block_handleAddTasksCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAddTasksCompletion {
        @Generated
        void call_handleAddTasksCompletion(@NotNull INAddTasksIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveSpatialEventTriggerForAddTasks:withCompletion:")
    default void resolveSpatialEventTriggerForAddTasksWithCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveSpatialEventTriggerForAddTasksWithCompletion") Block_resolveSpatialEventTriggerForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSpatialEventTriggerForAddTasksWithCompletion {
        @Generated
        void call_resolveSpatialEventTriggerForAddTasksWithCompletion(
                @NotNull INSpatialEventTriggerResolutionResult resolutionResult);
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     * 
     *      API-Since: 11.0
     *      Deprecated-Since: 13.0
     *      Deprecated-Message: resolveTargetTaskListForAddTasks:withCompletion: is deprecated. Use
     *      resolveTargetTaskListForAddTasks:completion: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolveTargetTaskListForAddTasks:withCompletion:")
    default void resolveTargetTaskListForAddTasksWithCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTargetTaskListForAddTasksWithCompletion") Block_resolveTargetTaskListForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTargetTaskListForAddTasksWithCompletion {
        @Generated
        void call_resolveTargetTaskListForAddTasksWithCompletion(@NotNull INTaskListResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTaskTitlesForAddTasks:withCompletion:")
    default void resolveTaskTitlesForAddTasksWithCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTaskTitlesForAddTasksWithCompletion") Block_resolveTaskTitlesForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskTitlesForAddTasksWithCompletion {
        @Generated
        void call_resolveTaskTitlesForAddTasksWithCompletion(
                @NotNull NSArray<? extends INSpeakableStringResolutionResult> resolutionResults);
    }

    /**
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: resolveTemporalEventTriggerForAddTasks:withCompletion: is deprecated. Use
     * resolveTemporalEventTriggerForAddTasks:completion: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolveTemporalEventTriggerForAddTasks:withCompletion:")
    default void resolveTemporalEventTriggerForAddTasksWithCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTemporalEventTriggerForAddTasksWithCompletion") Block_resolveTemporalEventTriggerForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemporalEventTriggerForAddTasksWithCompletion {
        @Generated
        void call_resolveTemporalEventTriggerForAddTasksWithCompletion(
                @NotNull INTemporalEventTriggerResolutionResult resolutionResult);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("resolvePriorityForAddTasks:withCompletion:")
    default void resolvePriorityForAddTasksWithCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_resolvePriorityForAddTasksWithCompletion") Block_resolvePriorityForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePriorityForAddTasksWithCompletion {
        @Generated
        void call_resolvePriorityForAddTasksWithCompletion(@NotNull INTaskPriorityResolutionResult resolutionResult);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("resolveTargetTaskListForAddTasks:completion:")
    default void resolveTargetTaskListForAddTasksCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTargetTaskListForAddTasksCompletion") Block_resolveTargetTaskListForAddTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTargetTaskListForAddTasksCompletion {
        @Generated
        void call_resolveTargetTaskListForAddTasksCompletion(
                @NotNull INAddTasksTargetTaskListResolutionResult resolutionResult);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("resolveTemporalEventTriggerForAddTasks:completion:")
    default void resolveTemporalEventTriggerForAddTasksCompletion(@NotNull INAddTasksIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTemporalEventTriggerForAddTasksCompletion") Block_resolveTemporalEventTriggerForAddTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemporalEventTriggerForAddTasksCompletion {
        @Generated
        void call_resolveTemporalEventTriggerForAddTasksCompletion(
                @NotNull INAddTasksTemporalEventTriggerResolutionResult resolutionResult);
    }
}
