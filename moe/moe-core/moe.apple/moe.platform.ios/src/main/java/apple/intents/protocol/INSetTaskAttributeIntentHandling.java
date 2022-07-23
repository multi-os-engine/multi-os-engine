package apple.intents.protocol;

import apple.intents.INSetTaskAttributeIntent;
import apple.intents.INSetTaskAttributeIntentResponse;
import apple.intents.INSetTaskAttributeTemporalEventTriggerResolutionResult;
import apple.intents.INSpatialEventTriggerResolutionResult;
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INTaskPriorityResolutionResult;
import apple.intents.INTaskResolutionResult;
import apple.intents.INTaskStatusResolutionResult;
import apple.intents.INTemporalEventTriggerResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSetTaskAttributeIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSetTaskAttributeIntentHandling")
public interface INSetTaskAttributeIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INSetTaskAttributeIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * @see INSetTaskAttributeIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSetTaskAttribute:completion:")
    default void confirmSetTaskAttributeCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_confirmSetTaskAttributeCompletion") Block_confirmSetTaskAttributeCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetTaskAttributeCompletion {
        @Generated
        void call_confirmSetTaskAttributeCompletion(INSetTaskAttributeIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSetTaskAttributeIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INSetTaskAttributeIntentResponse containing the details of
     *                   the result of having executed the intent
     * @see INSetTaskAttributeIntentResponse
     */
    @Generated
    @Selector("handleSetTaskAttribute:completion:")
    void handleSetTaskAttributeCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_handleSetTaskAttributeCompletion") Block_handleSetTaskAttributeCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetTaskAttributeCompletion {
        @Generated
        void call_handleSetTaskAttributeCompletion(INSetTaskAttributeIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveSpatialEventTriggerForSetTaskAttribute:withCompletion:")
    default void resolveSpatialEventTriggerForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion") Block_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion(
                INSpatialEventTriggerResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveStatusForSetTaskAttribute:withCompletion:")
    default void resolveStatusForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveStatusForSetTaskAttributeWithCompletion") Block_resolveStatusForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveStatusForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveStatusForSetTaskAttributeWithCompletion(INTaskStatusResolutionResult resolutionResult);
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * <p>
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveTargetTaskForSetTaskAttribute:withCompletion:")
    default void resolveTargetTaskForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveTargetTaskForSetTaskAttributeWithCompletion") Block_resolveTargetTaskForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTargetTaskForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveTargetTaskForSetTaskAttributeWithCompletion(INTaskResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTemporalEventTriggerForSetTaskAttribute:withCompletion:")
    default void resolveTemporalEventTriggerForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion") Block_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion(
                INTemporalEventTriggerResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolvePriorityForSetTaskAttribute:withCompletion:")
    default void resolvePriorityForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolvePriorityForSetTaskAttributeWithCompletion") Block_resolvePriorityForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePriorityForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolvePriorityForSetTaskAttributeWithCompletion(INTaskPriorityResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTaskTitleForSetTaskAttribute:withCompletion:")
    default void resolveTaskTitleForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveTaskTitleForSetTaskAttributeWithCompletion") Block_resolveTaskTitleForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskTitleForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveTaskTitleForSetTaskAttributeWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTemporalEventTriggerForSetTaskAttribute:completion:")
    default void resolveTemporalEventTriggerForSetTaskAttributeCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveTemporalEventTriggerForSetTaskAttributeCompletion") Block_resolveTemporalEventTriggerForSetTaskAttributeCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemporalEventTriggerForSetTaskAttributeCompletion {
        @Generated
        void call_resolveTemporalEventTriggerForSetTaskAttributeCompletion(
                INSetTaskAttributeTemporalEventTriggerResolutionResult resolutionResult);
    }
}
