package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INAddMediaIntent;
import apple.intents.INAddMediaIntentResponse;
import apple.intents.INAddMediaMediaDestinationResolutionResult;
import apple.intents.INAddMediaMediaItemResolutionResult;
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
@ObjCProtocolName("INAddMediaIntentHandling")
public interface INAddMediaIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmAddMedia:completion:")
    default void confirmAddMediaCompletion(INAddMediaIntent intent,
            @ObjCBlock(name = "call_confirmAddMediaCompletion") Block_confirmAddMediaCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmAddMediaCompletion {
        @Generated
        void call_confirmAddMediaCompletion(INAddMediaIntentResponse arg0);
    }

    @Generated
    @Selector("handleAddMedia:completion:")
    void handleAddMediaCompletion(INAddMediaIntent intent,
            @ObjCBlock(name = "call_handleAddMediaCompletion") Block_handleAddMediaCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAddMediaCompletion {
        @Generated
        void call_handleAddMediaCompletion(INAddMediaIntentResponse arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveMediaDestinationForAddMedia:withCompletion:")
    default void resolveMediaDestinationForAddMediaWithCompletion(INAddMediaIntent intent,
            @ObjCBlock(name = "call_resolveMediaDestinationForAddMediaWithCompletion") Block_resolveMediaDestinationForAddMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaDestinationForAddMediaWithCompletion {
        @Generated
        void call_resolveMediaDestinationForAddMediaWithCompletion(INAddMediaMediaDestinationResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveMediaItemsForAddMedia:withCompletion:")
    default void resolveMediaItemsForAddMediaWithCompletion(INAddMediaIntent intent,
            @ObjCBlock(name = "call_resolveMediaItemsForAddMediaWithCompletion") Block_resolveMediaItemsForAddMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaItemsForAddMediaWithCompletion {
        @Generated
        void call_resolveMediaItemsForAddMediaWithCompletion(
                NSArray<? extends INAddMediaMediaItemResolutionResult> arg0);
    }
}