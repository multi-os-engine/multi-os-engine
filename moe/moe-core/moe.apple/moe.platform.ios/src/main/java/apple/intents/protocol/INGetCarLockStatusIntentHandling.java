package apple.intents.protocol;

import apple.intents.INGetCarLockStatusIntent;
import apple.intents.INGetCarLockStatusIntentResponse;
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
 * @abstract Protocol to declare support for handling an INGetCarLockStatusIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * @discussion The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetCarLockStatusIntentHandling")
public interface INGetCarLockStatusIntentHandling {
    /**
     * @abstract Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * @discussion Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INGetCarLockStatusIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INGetCarLockStatusIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmGetCarLockStatus:completion:")
    default void confirmGetCarLockStatusCompletion(INGetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_confirmGetCarLockStatusCompletion") Block_confirmGetCarLockStatusCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetCarLockStatusCompletion {
        @Generated
        void call_confirmGetCarLockStatusCompletion(INGetCarLockStatusIntentResponse response);
    }

    /**
     * @abstract Handling method - Execute the task represented by the INGetCarLockStatusIntent that's passed in
     * @discussion Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INGetCarLockStatusIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INGetCarLockStatusIntentResponse
     */
    @Generated
    @Selector("handleGetCarLockStatus:completion:")
    void handleGetCarLockStatusCompletion(INGetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_handleGetCarLockStatusCompletion") Block_handleGetCarLockStatusCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetCarLockStatusCompletion {
        @Generated
        void call_handleGetCarLockStatusCompletion(INGetCarLockStatusIntentResponse response);
    }

    /**
     * @abstract Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * @discussion Called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveCarNameForGetCarLockStatus:withCompletion:")
    default void resolveCarNameForGetCarLockStatusWithCompletion(INGetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForGetCarLockStatusWithCompletion") Block_resolveCarNameForGetCarLockStatusWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForGetCarLockStatusWithCompletion {
        @Generated
        void call_resolveCarNameForGetCarLockStatusWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }
}