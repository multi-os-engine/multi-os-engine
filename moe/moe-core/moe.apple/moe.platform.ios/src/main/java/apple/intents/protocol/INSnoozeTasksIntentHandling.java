package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INSnoozeTasksIntent;
import apple.intents.INSnoozeTasksIntentResponse;
import apple.intents.INSnoozeTasksTaskResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSnoozeTasksIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSnoozeTasksIntentHandling")
public interface INSnoozeTasksIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INSnoozeTasksIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * @see INSnoozeTasksIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSnoozeTasks:completion:")
    default void confirmSnoozeTasksCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_confirmSnoozeTasksCompletion") Block_confirmSnoozeTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSnoozeTasksCompletion {
        @Generated
        void call_confirmSnoozeTasksCompletion(INSnoozeTasksIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSnoozeTasksIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INSnoozeTasksIntentResponse containing the details of the result of having executed the intent
     * @see INSnoozeTasksIntentResponse
     */
    @Generated
    @Selector("handleSnoozeTasks:completion:")
    void handleSnoozeTasksCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_handleSnoozeTasksCompletion") Block_handleSnoozeTasksCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSnoozeTasksCompletion {
        @Generated
        void call_handleSnoozeTasksCompletion(INSnoozeTasksIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveNextTriggerTimeForSnoozeTasks:withCompletion:")
    default void resolveNextTriggerTimeForSnoozeTasksWithCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_resolveNextTriggerTimeForSnoozeTasksWithCompletion") Block_resolveNextTriggerTimeForSnoozeTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveNextTriggerTimeForSnoozeTasksWithCompletion {
        @Generated
        void call_resolveNextTriggerTimeForSnoozeTasksWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * <p>
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveTasksForSnoozeTasks:withCompletion:")
    default void resolveTasksForSnoozeTasksWithCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_resolveTasksForSnoozeTasksWithCompletion") Block_resolveTasksForSnoozeTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTasksForSnoozeTasksWithCompletion {
        @Generated
        void call_resolveTasksForSnoozeTasksWithCompletion(
                NSArray<? extends INSnoozeTasksTaskResolutionResult> resolutionResults);
    }
}
