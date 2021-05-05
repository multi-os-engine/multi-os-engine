package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INBooleanResolutionResult;
import apple.intents.INPlayMediaIntent;
import apple.intents.INPlayMediaIntentResponse;
import apple.intents.INPlayMediaMediaItemResolutionResult;
import apple.intents.INPlayMediaPlaybackSpeedResolutionResult;
import apple.intents.INPlaybackQueueLocationResolutionResult;
import apple.intents.INPlaybackRepeatModeResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INPlayMediaIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INPlayMediaIntentHandling")
public interface INPlayMediaIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INPlayMediaIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INPlayMediaIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmPlayMedia:completion:")
    default void confirmPlayMediaCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_confirmPlayMediaCompletion") Block_confirmPlayMediaCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmPlayMediaCompletion {
        @Generated
        void call_confirmPlayMediaCompletion(INPlayMediaIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INPlayMediaIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INPlayMediaIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INPlayMediaIntentResponse
     */
    @Generated
    @Selector("handlePlayMedia:completion:")
    void handlePlayMediaCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_handlePlayMediaCompletion") Block_handlePlayMediaCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handlePlayMediaCompletion {
        @Generated
        void call_handlePlayMediaCompletion(INPlayMediaIntentResponse response);
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
    @Selector("resolveMediaItemsForPlayMedia:withCompletion:")
    default void resolveMediaItemsForPlayMediaWithCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_resolveMediaItemsForPlayMediaWithCompletion") Block_resolveMediaItemsForPlayMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaItemsForPlayMediaWithCompletion {
        @Generated
        void call_resolveMediaItemsForPlayMediaWithCompletion(
                NSArray<? extends INPlayMediaMediaItemResolutionResult> resolutionResults);
    }

    @Generated
    @IsOptional
    @Selector("resolvePlayShuffledForPlayMedia:withCompletion:")
    default void resolvePlayShuffledForPlayMediaWithCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_resolvePlayShuffledForPlayMediaWithCompletion") Block_resolvePlayShuffledForPlayMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePlayShuffledForPlayMediaWithCompletion {
        @Generated
        void call_resolvePlayShuffledForPlayMediaWithCompletion(INBooleanResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolvePlaybackQueueLocationForPlayMedia:withCompletion:")
    default void resolvePlaybackQueueLocationForPlayMediaWithCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_resolvePlaybackQueueLocationForPlayMediaWithCompletion") Block_resolvePlaybackQueueLocationForPlayMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePlaybackQueueLocationForPlayMediaWithCompletion {
        @Generated
        void call_resolvePlaybackQueueLocationForPlayMediaWithCompletion(
                INPlaybackQueueLocationResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolvePlaybackRepeatModeForPlayMedia:withCompletion:")
    default void resolvePlaybackRepeatModeForPlayMediaWithCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_resolvePlaybackRepeatModeForPlayMediaWithCompletion") Block_resolvePlaybackRepeatModeForPlayMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePlaybackRepeatModeForPlayMediaWithCompletion {
        @Generated
        void call_resolvePlaybackRepeatModeForPlayMediaWithCompletion(
                INPlaybackRepeatModeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolvePlaybackSpeedForPlayMedia:withCompletion:")
    default void resolvePlaybackSpeedForPlayMediaWithCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_resolvePlaybackSpeedForPlayMediaWithCompletion") Block_resolvePlaybackSpeedForPlayMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePlaybackSpeedForPlayMediaWithCompletion {
        @Generated
        void call_resolvePlaybackSpeedForPlayMediaWithCompletion(
                INPlayMediaPlaybackSpeedResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveResumePlaybackForPlayMedia:withCompletion:")
    default void resolveResumePlaybackForPlayMediaWithCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_resolveResumePlaybackForPlayMediaWithCompletion") Block_resolveResumePlaybackForPlayMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveResumePlaybackForPlayMediaWithCompletion {
        @Generated
        void call_resolveResumePlaybackForPlayMediaWithCompletion(INBooleanResolutionResult resolutionResult);
    }
}