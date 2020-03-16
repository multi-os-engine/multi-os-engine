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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INPlayMediaIntentHandling")
public interface INPlayMediaIntentHandling {
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
        void call_confirmPlayMediaCompletion(INPlayMediaIntentResponse arg0);
    }

    @Generated
    @Selector("handlePlayMedia:completion:")
    void handlePlayMediaCompletion(INPlayMediaIntent intent,
            @ObjCBlock(name = "call_handlePlayMediaCompletion") Block_handlePlayMediaCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handlePlayMediaCompletion {
        @Generated
        void call_handlePlayMediaCompletion(INPlayMediaIntentResponse arg0);
    }

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
                NSArray<? extends INPlayMediaMediaItemResolutionResult> arg0);
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
        void call_resolvePlayShuffledForPlayMediaWithCompletion(INBooleanResolutionResult arg0);
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
        void call_resolvePlaybackQueueLocationForPlayMediaWithCompletion(INPlaybackQueueLocationResolutionResult arg0);
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
        void call_resolvePlaybackRepeatModeForPlayMediaWithCompletion(INPlaybackRepeatModeResolutionResult arg0);
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
        void call_resolvePlaybackSpeedForPlayMediaWithCompletion(INPlayMediaPlaybackSpeedResolutionResult arg0);
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
        void call_resolveResumePlaybackForPlayMediaWithCompletion(INBooleanResolutionResult arg0);
    }
}