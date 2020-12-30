package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INMediaAffinityTypeResolutionResult;
import apple.intents.INUpdateMediaAffinityIntent;
import apple.intents.INUpdateMediaAffinityIntentResponse;
import apple.intents.INUpdateMediaAffinityMediaItemResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @abstract Protocol to declare support for handling an INUpdateMediaAffinityIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * @discussion The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INUpdateMediaAffinityIntentHandling")
public interface INUpdateMediaAffinityIntentHandling {
    /**
     * @abstract Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * @discussion Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INUpdateMediaAffinityIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INUpdateMediaAffinityIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmUpdateMediaAffinity:completion:")
    default void confirmUpdateMediaAffinityCompletion(INUpdateMediaAffinityIntent intent,
            @ObjCBlock(name = "call_confirmUpdateMediaAffinityCompletion") Block_confirmUpdateMediaAffinityCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmUpdateMediaAffinityCompletion {
        @Generated
        void call_confirmUpdateMediaAffinityCompletion(INUpdateMediaAffinityIntentResponse response);
    }

    /**
     * @abstract Handling method - Execute the task represented by the INUpdateMediaAffinityIntent that's passed in
     * @discussion Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INUpdateMediaAffinityIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INUpdateMediaAffinityIntentResponse
     */
    @Generated
    @Selector("handleUpdateMediaAffinity:completion:")
    void handleUpdateMediaAffinityCompletion(INUpdateMediaAffinityIntent intent,
            @ObjCBlock(name = "call_handleUpdateMediaAffinityCompletion") Block_handleUpdateMediaAffinityCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleUpdateMediaAffinityCompletion {
        @Generated
        void call_handleUpdateMediaAffinityCompletion(INUpdateMediaAffinityIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveAffinityTypeForUpdateMediaAffinity:withCompletion:")
    default void resolveAffinityTypeForUpdateMediaAffinityWithCompletion(INUpdateMediaAffinityIntent intent,
            @ObjCBlock(name = "call_resolveAffinityTypeForUpdateMediaAffinityWithCompletion") Block_resolveAffinityTypeForUpdateMediaAffinityWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAffinityTypeForUpdateMediaAffinityWithCompletion {
        @Generated
        void call_resolveAffinityTypeForUpdateMediaAffinityWithCompletion(
                INMediaAffinityTypeResolutionResult resolutionResult);
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
    @Selector("resolveMediaItemsForUpdateMediaAffinity:withCompletion:")
    default void resolveMediaItemsForUpdateMediaAffinityWithCompletion(INUpdateMediaAffinityIntent intent,
            @ObjCBlock(name = "call_resolveMediaItemsForUpdateMediaAffinityWithCompletion") Block_resolveMediaItemsForUpdateMediaAffinityWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaItemsForUpdateMediaAffinityWithCompletion {
        @Generated
        void call_resolveMediaItemsForUpdateMediaAffinityWithCompletion(
                NSArray<? extends INUpdateMediaAffinityMediaItemResolutionResult> resolutionResults);
    }
}