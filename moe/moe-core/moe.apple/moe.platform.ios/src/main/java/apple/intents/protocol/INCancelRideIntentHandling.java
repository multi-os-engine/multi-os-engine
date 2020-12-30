package apple.intents.protocol;

import apple.intents.INCancelRideIntent;
import apple.intents.INCancelRideIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @abstract Protocol to declare support for handling an INCancelRideIntent. By implementing this protocol, a class can provide logic for confirming and handling the intent.
 * @discussion The minimum requirement for an implementing class is that it should be able to confirm and handle the intent. The handling method is always called last, after confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INCancelRideIntentHandling")
public interface INCancelRideIntentHandling {
    /**
     * @abstract Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * @discussion Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system may not use the cancel ride intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INCancelRideIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INCancelRideIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmCancelRide:completion:")
    default void confirmCancelRideCompletion(INCancelRideIntent intent,
            @ObjCBlock(name = "call_confirmCancelRideCompletion") Block_confirmCancelRideCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmCancelRideCompletion {
        @Generated
        void call_confirmCancelRideCompletion(INCancelRideIntentResponse response);
    }

    /**
     * @abstract Handling method - Execute the task represented by the INCancelRideIntent that's passed in
     * @discussion Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INCancelRideIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INCancelRideIntentResponse
     */
    @Generated
    @Selector("handleCancelRide:completion:")
    void handleCancelRideCompletion(INCancelRideIntent intent,
            @ObjCBlock(name = "call_handleCancelRideCompletion") Block_handleCancelRideCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCancelRideCompletion {
        @Generated
        void call_handleCancelRideCompletion(INCancelRideIntentResponse response);
    }
}