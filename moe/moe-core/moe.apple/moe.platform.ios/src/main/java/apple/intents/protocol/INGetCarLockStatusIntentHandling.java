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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetCarLockStatusIntentHandling")
public interface INGetCarLockStatusIntentHandling {
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
        void call_confirmGetCarLockStatusCompletion(INGetCarLockStatusIntentResponse arg0);
    }

    @Generated
    @Selector("handleGetCarLockStatus:completion:")
    void handleGetCarLockStatusCompletion(INGetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_handleGetCarLockStatusCompletion") Block_handleGetCarLockStatusCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetCarLockStatusCompletion {
        @Generated
        void call_handleGetCarLockStatusCompletion(INGetCarLockStatusIntentResponse arg0);
    }

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
        void call_resolveCarNameForGetCarLockStatusWithCompletion(INSpeakableStringResolutionResult arg0);
    }
}