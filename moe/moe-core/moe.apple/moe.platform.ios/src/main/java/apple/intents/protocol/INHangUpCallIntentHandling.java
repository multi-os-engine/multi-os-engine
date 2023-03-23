package apple.intents.protocol;

import apple.intents.INHangUpCallIntent;
import apple.intents.INHangUpCallIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INHangUpCallIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 16.2
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INHangUpCallIntentHandling")
public interface INHangUpCallIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INHangUpCallIntentResponse containing additional details about
     *                   the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INHangUpCallIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmHangUpCall:completion:")
    default void confirmHangUpCallCompletion(INHangUpCallIntent intent,
            @ObjCBlock(name = "call_confirmHangUpCallCompletion") Block_confirmHangUpCallCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmHangUpCallCompletion {
        @Generated
        void call_confirmHangUpCallCompletion(INHangUpCallIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INHangUpCallIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INHangUpCallIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INHangUpCallIntentResponse
     */
    @Generated
    @Selector("handleHangUpCall:completion:")
    void handleHangUpCallCompletion(INHangUpCallIntent intent,
            @ObjCBlock(name = "call_handleHangUpCallCompletion") Block_handleHangUpCallCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleHangUpCallCompletion {
        @Generated
        void call_handleHangUpCallCompletion(INHangUpCallIntentResponse response);
    }
}