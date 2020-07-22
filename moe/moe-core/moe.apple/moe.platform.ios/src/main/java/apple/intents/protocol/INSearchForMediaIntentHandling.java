package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INSearchForMediaIntent;
import apple.intents.INSearchForMediaIntentResponse;
import apple.intents.INSearchForMediaMediaItemResolutionResult;
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
@ObjCProtocolName("INSearchForMediaIntentHandling")
public interface INSearchForMediaIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSearchForMedia:completion:")
    default void confirmSearchForMediaCompletion(INSearchForMediaIntent intent,
            @ObjCBlock(name = "call_confirmSearchForMediaCompletion") Block_confirmSearchForMediaCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForMediaCompletion {
        @Generated
        void call_confirmSearchForMediaCompletion(INSearchForMediaIntentResponse response);
    }

    @Generated
    @Selector("handleSearchForMedia:completion:")
    void handleSearchForMediaCompletion(INSearchForMediaIntent intent,
            @ObjCBlock(name = "call_handleSearchForMediaCompletion") Block_handleSearchForMediaCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForMediaCompletion {
        @Generated
        void call_handleSearchForMediaCompletion(INSearchForMediaIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveMediaItemsForSearchForMedia:withCompletion:")
    default void resolveMediaItemsForSearchForMediaWithCompletion(INSearchForMediaIntent intent,
            @ObjCBlock(name = "call_resolveMediaItemsForSearchForMediaWithCompletion") Block_resolveMediaItemsForSearchForMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaItemsForSearchForMediaWithCompletion {
        @Generated
        void call_resolveMediaItemsForSearchForMediaWithCompletion(
                NSArray<? extends INSearchForMediaMediaItemResolutionResult> resolutionResults);
    }
}