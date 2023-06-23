package apple.intents.protocol;

import apple.intents.INSendRideFeedbackIntent;
import apple.intents.INSendRideFeedbackIntentResponse;
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
 * Protocol to declare support for handling an INSendRideFeedbackIntent. By implementing this protocol, a class can
 * provide logic for confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The handling method
 * is always called last, after confirming the intent.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSendRideFeedbackIntentHandling")
public interface INSendRideFeedbackIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will not allow calling of the handle method.
     * 
     * @param sendRideFeedbackIntent The input intent
     * @param completion             The response block contains an INSendRideFeedbackIntentResponse containing
     *                               additional details about the intent that may be relevant for the system to show the
     *                               user prior to handling.
     * 
     * @see INSendRideFeedbackIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSendRideFeedback:completion:")
    default void confirmSendRideFeedbackCompletion(@NotNull INSendRideFeedbackIntent sendRideFeedbackIntent,
            @NotNull @ObjCBlock(name = "call_confirmSendRideFeedbackCompletion") Block_confirmSendRideFeedbackCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSendRideFeedbackCompletion {
        @Generated
        void call_confirmSendRideFeedbackCompletion(@NotNull INSendRideFeedbackIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSendRideFeedbackIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param sendRideFeedbackintent The input intent
     * @param completion             The response handling block takes a INSendRideFeedbackIntentResponse containing the
     *                               details of the result of having executed the intent
     * 
     * @see INSendRideFeedbackIntentResponse
     */
    @Generated
    @Selector("handleSendRideFeedback:completion:")
    void handleSendRideFeedbackCompletion(@NotNull INSendRideFeedbackIntent sendRideFeedbackintent,
            @NotNull @ObjCBlock(name = "call_handleSendRideFeedbackCompletion") Block_handleSendRideFeedbackCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSendRideFeedbackCompletion {
        @Generated
        void call_handleSendRideFeedbackCompletion(@NotNull INSendRideFeedbackIntentResponse response);
    }
}
