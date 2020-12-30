package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INDeleteTasksIntent;
import apple.intents.INDeleteTasksIntentResponse;
import apple.intents.INDeleteTasksTaskListResolutionResult;
import apple.intents.INDeleteTasksTaskResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INDeleteTasksIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INDeleteTasksIntentHandling")
public interface INDeleteTasksIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INDeleteTasksIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INDeleteTasksIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmDeleteTasks:completion:")
    default void confirmDeleteTasksCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_confirmDeleteTasksCompletion") Block_confirmDeleteTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmDeleteTasksCompletion {
        @Generated
        void call_confirmDeleteTasksCompletion(INDeleteTasksIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INDeleteTasksIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INDeleteTasksIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INDeleteTasksIntentResponse
     */
    @Generated
    @Selector("handleDeleteTasks:completion:")
    void handleDeleteTasksCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_handleDeleteTasksCompletion") Block_handleDeleteTasksCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleDeleteTasksCompletion {
        @Generated
        void call_handleDeleteTasksCompletion(INDeleteTasksIntentResponse response);
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveTaskListForDeleteTasks:withCompletion:")
    default void resolveTaskListForDeleteTasksWithCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_resolveTaskListForDeleteTasksWithCompletion") Block_resolveTaskListForDeleteTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskListForDeleteTasksWithCompletion {
        @Generated
        void call_resolveTaskListForDeleteTasksWithCompletion(INDeleteTasksTaskListResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTasksForDeleteTasks:withCompletion:")
    default void resolveTasksForDeleteTasksWithCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_resolveTasksForDeleteTasksWithCompletion") Block_resolveTasksForDeleteTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTasksForDeleteTasksWithCompletion {
        @Generated
        void call_resolveTasksForDeleteTasksWithCompletion(
                NSArray<? extends INDeleteTasksTaskResolutionResult> resolutionResults);
    }
}