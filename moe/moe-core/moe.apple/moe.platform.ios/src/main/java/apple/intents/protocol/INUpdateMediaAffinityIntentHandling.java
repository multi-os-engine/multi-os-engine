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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INUpdateMediaAffinityIntentHandling")
public interface INUpdateMediaAffinityIntentHandling {
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