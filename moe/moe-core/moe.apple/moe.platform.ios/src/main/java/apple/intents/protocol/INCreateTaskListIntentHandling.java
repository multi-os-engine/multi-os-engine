package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INCreateTaskListIntent;
import apple.intents.INCreateTaskListIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INCreateTaskListIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 11.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INCreateTaskListIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INCreateTaskListIntentHandling")
public interface INCreateTaskListIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INCreateTaskListIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INCreateTaskListIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmCreateTaskList:completion:")
    default void confirmCreateTaskListCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_confirmCreateTaskListCompletion") Block_confirmCreateTaskListCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmCreateTaskListCompletion {
        @Generated
        void call_confirmCreateTaskListCompletion(INCreateTaskListIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INCreateTaskListIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INCreateTaskListIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INCreateTaskListIntentResponse
     */
    @Generated
    @Selector("handleCreateTaskList:completion:")
    void handleCreateTaskListCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_handleCreateTaskListCompletion") Block_handleCreateTaskListCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCreateTaskListCompletion {
        @Generated
        void call_handleCreateTaskListCompletion(INCreateTaskListIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveGroupNameForCreateTaskList:withCompletion:")
    default void resolveGroupNameForCreateTaskListWithCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_resolveGroupNameForCreateTaskListWithCompletion") Block_resolveGroupNameForCreateTaskListWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNameForCreateTaskListWithCompletion {
        @Generated
        void call_resolveGroupNameForCreateTaskListWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTaskTitlesForCreateTaskList:withCompletion:")
    default void resolveTaskTitlesForCreateTaskListWithCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_resolveTaskTitlesForCreateTaskListWithCompletion") Block_resolveTaskTitlesForCreateTaskListWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskTitlesForCreateTaskListWithCompletion {
        @Generated
        void call_resolveTaskTitlesForCreateTaskListWithCompletion(
                NSArray<? extends INSpeakableStringResolutionResult> resolutionResults);
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
     */
    @Generated
    @IsOptional
    @Selector("resolveTitleForCreateTaskList:withCompletion:")
    default void resolveTitleForCreateTaskListWithCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_resolveTitleForCreateTaskListWithCompletion") Block_resolveTitleForCreateTaskListWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTitleForCreateTaskListWithCompletion {
        @Generated
        void call_resolveTitleForCreateTaskListWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }
}
