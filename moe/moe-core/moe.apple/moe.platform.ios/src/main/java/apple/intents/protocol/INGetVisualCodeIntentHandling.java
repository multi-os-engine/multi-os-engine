package apple.intents.protocol;

import apple.intents.INGetVisualCodeIntent;
import apple.intents.INGetVisualCodeIntentResponse;
import apple.intents.INVisualCodeTypeResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INGetVisualCodeIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetVisualCodeIntentHandling")
public interface INGetVisualCodeIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INGetVisualCodeIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INGetVisualCodeIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmGetVisualCode:completion:")
    default void confirmGetVisualCodeCompletion(INGetVisualCodeIntent intent,
            @ObjCBlock(name = "call_confirmGetVisualCodeCompletion") Block_confirmGetVisualCodeCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetVisualCodeCompletion {
        @Generated
        void call_confirmGetVisualCodeCompletion(INGetVisualCodeIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INGetVisualCodeIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INGetVisualCodeIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INGetVisualCodeIntentResponse
     */
    @Generated
    @Selector("handleGetVisualCode:completion:")
    void handleGetVisualCodeCompletion(INGetVisualCodeIntent intent,
            @ObjCBlock(name = "call_handleGetVisualCodeCompletion") Block_handleGetVisualCodeCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetVisualCodeCompletion {
        @Generated
        void call_handleGetVisualCodeCompletion(INGetVisualCodeIntentResponse response);
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
    @Selector("resolveVisualCodeTypeForGetVisualCode:withCompletion:")
    default void resolveVisualCodeTypeForGetVisualCodeWithCompletion(INGetVisualCodeIntent intent,
            @ObjCBlock(name = "call_resolveVisualCodeTypeForGetVisualCodeWithCompletion") Block_resolveVisualCodeTypeForGetVisualCodeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveVisualCodeTypeForGetVisualCodeWithCompletion {
        @Generated
        void call_resolveVisualCodeTypeForGetVisualCodeWithCompletion(
                INVisualCodeTypeResolutionResult resolutionResult);
    }
}