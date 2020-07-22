package apple.intents.protocol;

import apple.intents.INBooleanResolutionResult;
import apple.intents.INSetCarLockStatusIntent;
import apple.intents.INSetCarLockStatusIntentResponse;
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
@ObjCProtocolName("INSetCarLockStatusIntentHandling")
public interface INSetCarLockStatusIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetCarLockStatus:completion:")
    default void confirmSetCarLockStatusCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_confirmSetCarLockStatusCompletion") Block_confirmSetCarLockStatusCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetCarLockStatusCompletion {
        @Generated
        void call_confirmSetCarLockStatusCompletion(INSetCarLockStatusIntentResponse response);
    }

    @Generated
    @Selector("handleSetCarLockStatus:completion:")
    void handleSetCarLockStatusCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_handleSetCarLockStatusCompletion") Block_handleSetCarLockStatusCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetCarLockStatusCompletion {
        @Generated
        void call_handleSetCarLockStatusCompletion(INSetCarLockStatusIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveCarNameForSetCarLockStatus:withCompletion:")
    default void resolveCarNameForSetCarLockStatusWithCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForSetCarLockStatusWithCompletion") Block_resolveCarNameForSetCarLockStatusWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForSetCarLockStatusWithCompletion {
        @Generated
        void call_resolveCarNameForSetCarLockStatusWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveLockedForSetCarLockStatus:withCompletion:")
    default void resolveLockedForSetCarLockStatusWithCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_resolveLockedForSetCarLockStatusWithCompletion") Block_resolveLockedForSetCarLockStatusWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLockedForSetCarLockStatusWithCompletion {
        @Generated
        void call_resolveLockedForSetCarLockStatusWithCompletion(INBooleanResolutionResult resolutionResult);
    }
}